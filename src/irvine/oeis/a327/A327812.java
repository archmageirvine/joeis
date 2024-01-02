package irvine.oeis.a327;
// manually 2023-12-26

import irvine.math.group.IntegersModMul;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A327812 Number of irreducible factors in the factorization of the n-th cyclotomic polynomial over GF(3) (counted with multiplicity).
 * @author Georg Fischer
 */
public class A327812 extends AbstractSequence implements DirectSequence {

  private int mN;
  private final Z mBase1;
  private final Z mBase2;

  /** Construct the sequence. */
  public A327812() {
    this(1, 3, 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param base1 prime factor of <code>base2</code>
   * @param base2 base for the order
   */
  public A327812(final int offset, final int base1, final int base2) {
    super(offset);
    mN = 0;
    mBase1 = Z.valueOf(base1);
    mBase2 = Z.valueOf(base2);
  }

  @Override
  public Z a(Z n) {
    // Let n = 3^e*s, gcd(3,s) = 1, then a(n) = phi(n)/ord(3,s)
    // a(n) = my(s=n/3^valuation(n, 3)); eulerphi(n)/znorder(Mod(3, s))
    final int e = ZUtils.valuation(n, mBase1);
    final Z s = n.divide(mBase1.pow(e));
    return Euler.phi(n).divide(new IntegersModMul(s).order(mBase2));
  }

  @Override
  public Z a(int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
