package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A064989 Multiplicative with a(2^e) = 1 and a(p^e) = prevprime(p)^e for odd primes p.
 * @author Sean A. Irvine
 */
public class A064989 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A064989(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A064989() {
    super(1);
  }

  @Override
  public Z a(final int n) {
    return getProduct(Jaguar.factor(n));
  }

  @Override
  public Z a(final Z nz) {
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
      prod = prod.multiply(p.equals(Z.TWO) ? Z.ONE : mPrime.prevPrime(p).pow(fs.getExponent(p)));
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
      prod = prod.multiply(p.equals(Z.TWO) ? Z.ONE : mPrime.prevPrime(p).pow(fs.getExponent(p)));
    }
    return prod;
  }
}
