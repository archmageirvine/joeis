package irvine.oeis.a054;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A198300.
 * @author Sean A. Irvine
 */
public class A054769 implements Sequence {

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
