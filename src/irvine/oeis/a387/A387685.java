package irvine.oeis.a387;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387685 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A387685 extends Sequence1 {

  private long mN = 0;
  private long mCount = 0;

  private void search(final long n, final long s, final long t, final Q r) {
    long sum = s + t;
    long v = t;
    while (sum < n) {
      final Q u = r.multiply(v);
      if (!u.isInteger()) {
        return;
      }
      v = u.toZ().longValueExact();
      sum += v;
    }
    if (sum == n) {
//      if (n == 469) {
//        System.out.println(n + " " + s + " " + t + " " + r);
//      }
      ++mCount;
    }
  }

  private void search(final long n, final long s) {
    for (long t = s + 1; s + t < n; ++t) {
      search(n, s, t, new Q(t, s));
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    for (long s = 1; s < mN; ++s) {
      search(mN, s);
    }
    return Z.valueOf(mCount);
  }
}
