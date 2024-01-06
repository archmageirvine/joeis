package irvine.oeis.a054;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054769 Number of integer n-tuples {x(1),x(2),...,x(n)} with the following properties: (1) x(1)=1 and, for k&gt;1, if d=x(k)-x(k-1), then (2) d is relatively prime to x(k-1) and (3) d=x(i) for some i in {1,2,...,k-1}.
 * @author Sean A. Irvine
 */
public class A054769 extends Sequence1 {

  private final TreeSet<Long> mA = new TreeSet<>();
  private int mN = 0;
  private long mCount = 0;

  private void search(final long prev) {
    if (mA.size() == mN) {
      ++mCount;
      return;
    }
    for (long k = prev; k <= 2 * prev; ++k) {
      if (LongUtils.gcd(k, prev) == 1) {
        final long d = k - prev;
        if (d == k || mA.contains(d)) {
          mA.add(k);
          search(k);
          mA.remove(k);
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    mA.clear();
    mA.add(1L);
    search(1L);
    return Z.valueOf(mCount);
  }
}
