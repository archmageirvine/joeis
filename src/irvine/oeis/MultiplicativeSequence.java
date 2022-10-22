package irvine.oeis;

import java.util.function.BiFunction;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Base class for (multiplicative) arithmetic functions.
 * @author Sean A. Irvine
 */
public class MultiplicativeSequence extends AbstractSequence {

  private final BiFunction<Z, Integer, Z> mF;
  private final long mStep;
  protected long mN;

  /**
   * Construct a multiplicative sequence with the given function.
   * @param offset index of first term
   * @param step step between values of n
   * @param f function
   */
  public MultiplicativeSequence(final int offset, final long step, final BiFunction<Z, Integer, Z> f) {
    super(offset);
    mStep = step;
    mN = offset - mStep;
    mF = f;
  }

  /**
   * Construct a multiplicative sequence with the given function.
   * @param offset index of first term
   * @param f function
   */
  public MultiplicativeSequence(final int offset, final BiFunction<Z, Integer, Z> f) {
    this(offset, 1, f);
  }

  @Override
  public Z next() {
    mN += mStep;
    final FactorSequence fs = Jaguar.factor(mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(mF.apply(p, fs.getExponent(p)));
    }
    return prod;
  }

  /**
   * Test whether the parameter is 2.
   * @param p the prime to be tested
   * @return true if <code>p == 2</code>, false otherwise
   */
  protected static boolean is2(final Z p) {
    return p.equals(Z.TWO);
  }

  /**
   * Test whether the parameter is 3.
   * @param p the prime to be tested
   * @return true if <code>p == 3</code>, false otherwise
   */
  protected static boolean is3(final Z p) {
    return p.equals(Z.THREE);
  }

  /**
   * Test whether the parameter is 5.
   * @param p the prime to be tested
   * @return true if <code>p == 5</code>, false otherwise
   */
  protected static boolean is5(final Z p) {
    return p.equals(Z.FIVE);
  }

  /**
   * Test whether the parameter is 7.
   * @param p the prime to be tested
   * @return true if <code>p == 7</code>, false otherwise
   */
  protected static boolean is7(final Z p) {
    return p.equals(Z.SEVEN);
  }

  /**
   * Test a modulus condition with one residue.
   * @param modulus modulus
   * @param p the prime to be tested
   * @param res1 first residue
   * @return true if <code>mod(p,m) IN {res1}</code>, false otherwise
   */
  protected static boolean isMod(final int modulus, final Z p, final int res1) {
    return p.mod(Z.valueOf(modulus)).intValue() == res1;
  }

  /**
   * Test a modulus condition with two residues.
   * @param modulus modulus
   * @param p the prime to be tested
   * @param res1 first residue
   * @param res2 second residue
   * @return true if <code>mod(p,m) IN {res1, res2}</code>, false otherwise
   */
  protected static boolean isMod(final int modulus, final Z p, final int res1, final int res2) {
    final int res = p.mod(Z.valueOf(modulus)).intValue();
    return res == res1 || res == res2;
  }

  /**
   * Test a modulus condition with three residues.
   * @param modulus modulus
   * @param p the prime to be tested
   * @param res1 first residue
   * @param res2 second residue
   * @param res3 third residue
   * @return true if <code>mod(p,m) IN {res1, res2, res3}</code>, false otherwise
   */
  protected static boolean isMod(final int modulus, final Z p, final int res1, final int res2, final int res3) {
    final int res = p.mod(Z.valueOf(modulus)).intValue();
    return res == res1 || res == res2;
  }

  /**
   * Test a modulus condition with a list of residues.
   * @param modulus modulus
   * @param p the prime to be tested
   * @param resList list of residues
   * @return true if <code>mod(p,m) IN {resList}</code>, false otherwise
   */
  protected static boolean isMod(final int modulus, final Z p, final int... resList) {
    final int res = p.mod(Z.valueOf(modulus)).intValue();
    boolean result = false;
    int ires = resList.length;
    while (!result && --ires >= 0) {
      result = resList[ires] == res;
    }
    return result;
  }

  /**
   * Raise -1 to the power of e.
   * @param e exponent
   * @return <code>(-1)^e</code>
   */
  protected static int neg1(final int e) {
    return ((e & 1) == 0) ? 1 : -1;
  }

  /**
   * Convert the exponents.
   * @param e exponent
   * @return 1 if e is even, 0 if it is odd
   */
  protected static int oneOr0(final int e) {
    return ((e & 1) == 0) ? 1 : 0;
  }

  /**
   * Return an the sum of divisors.
   * @param p prime
   * @param e exponent
   * @return <code>(p^(e + 1) - 1) / (p - 1)</code>.
   */
  protected static Z sigmaP(final Z p, final int e) {
    return p.pow(e + 1).subtract(1).divide(p.subtract(1));
  }
}
