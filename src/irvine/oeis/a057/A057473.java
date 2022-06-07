package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a006.A006512;

/**
 * A057473 Let p(i) =i-th prime, let twin(n) = (P,Q) be n-th pair of twin primes; sequence gives p(Q).
 * @author Sean A. Irvine
 */
public class A057473 extends A006512 {

  private long mN = 0;
  private final Sequence mPrimes = new A000040();

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    Z q;
    do {
      q = mPrimes.next();
    } while (++mN < p);
    return q;
  }
}
