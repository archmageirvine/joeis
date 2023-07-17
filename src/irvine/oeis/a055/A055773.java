package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A055773 a(n) = Product_{p in P_n} where P_n = {p prime, n/2 &lt; p &lt;= n }.
 * @author Sean A. Irvine
 */
public class A055773 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A055773(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A055773() {
    super(0);
  }

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long p = mPrime.nextPrime(mN / 2); p <= mN; p = mPrime.nextPrime(p)) {
      prod = prod.multiply(p);
    }
    return prod;
  }
}
