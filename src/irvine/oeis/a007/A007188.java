package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A007188 Multiplicative encoding of Pascal triangle: Product p(i+1)^C(n,i).
 * @author Sean A. Irvine
 */
public class A007188 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A007188(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A007188() {
    super(0);
  }

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    Z p = Z.ONE;
    for (long k = 0; k <= mN; ++k) {
      p = mPrime.nextPrime(p);
      prod = prod.multiply(p.pow(Binomial.binomial(mN, k)));
    }
    return prod;
  }
}
