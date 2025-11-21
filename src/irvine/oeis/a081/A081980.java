package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A081980 a(n) = numerator of the sum of the reciprocals of the n primes from prime(n(n-1)/2+1) to prime(n(n+1)/2).
 * @author Sean A. Irvine
 */
public class A081980 extends A000040 {

  private long mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(new Q(Z.ONE, super.next()));
    }
    return select(sum);
  }
}
