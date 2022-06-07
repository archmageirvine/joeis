package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a001.A001359;

/**
 * A057470 Let p(i) =i-th prime, let twin(n) = (P,Q) be n-th pair of twin primes; sequence gives p(P).
 * @author Sean A. Irvine
 */
public class A057470 extends A001359 {

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
