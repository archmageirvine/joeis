package irvine.oeis.a009;

import java.util.TreeSet;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009475.
 * @author Sean A. Irvine
 */
public class A009475 implements Sequence {

  private final TreeSet<Q> mNext = new TreeSet<>();
  private long mNextY = 2;

  protected long row() {
    return 6;
  }

  {
    for (long k = row() + 1; k >= 2; --k) {
      mNext.add(new Q(k, 1));
    }
  }

  private Z line(final long start, final long x, final long y) {
    Z sum = Z.ZERO;
    for (long n = start + y, m = x; m <= n; n += y, m += x) {
      sum = sum.add(Binomial.binomial(n, m));
    }
    return sum;
  }

  @Override
  public Z next() {
    Q w;
    while ((w = new Q(row() + mNextY, mNextY)).compareTo(mNext.last()) > 0) {
      final Q delta = new Q(1, mNextY);
      while (w.compareTo(Q.ONE) > 0) {
        if (w.den().longValue() == mNextY) {
          mNext.add(w);
        }
        w = w.subtract(delta);
      }
      ++mNextY;
    }
    final Q t = mNext.pollLast();
    final long x = t.num().longValue();
    final long y = t.den().longValue();
    return line(row(), x, y);
  }
}
