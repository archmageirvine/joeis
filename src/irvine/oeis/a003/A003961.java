package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A003961 Completely multiplicative with a(prime(k)) = prime(k+1).
 * @author Sean A. Irvine
 */
public class A003961 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A003961(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A003961() {
    super(1);
  }

  /**
   * Direct access with int parameter.
   * @param n index
   * @return function value
   */
  public static Z a(final int n) {
    return getProduct(Jaguar.factor(n));
  }

  /**
   * Direct access with Z parameter.
   * @param n index
   * @return function value
   */
  public static Z a(final Z nz) {
    return getProduct(Jaguar.factor(nz));
  }

  /**
   * Compute the new term.
   * @param fs FactorSequence
   * @return product with modified primes
   */
  private static Z getProduct(final FactorSequence fs) {
    final Fast mPrime = new Fast();
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(mPrime.nextPrime(p).pow(fs.getExponent(p)));
    }
    return prod;
  }

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(mPrime.nextPrime(p).pow(fs.getExponent(p)));
    }
    return prod;
  }
}
