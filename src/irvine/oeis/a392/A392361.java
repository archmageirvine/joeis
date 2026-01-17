package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392361 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A392361 extends Sequence1 {

  private long mN = 5;
  private int mCount;

  private void count(final Z[] d, final int pos, final Z sum, final int cnt) {
    final int c = sum.compareTo(d[d.length - 1]);
    if (c >= 0) {
      if (c == 0) {
        mCount = cnt;
      }
      return;
    }
    if (cnt >= mCount) {
      return;
    }
    for (int k = pos - 1; k >= 0; --k) {
      count(d, k, sum.add(d[k]), cnt + 1);
    }
  }

  @Override
  public Z next() {
    while (true) {
      mCount = Integer.MAX_VALUE;
      final Z[] d = Jaguar.factor(++mN).divisorsSorted();
      count(d, d.length - 1, Z.ZERO, 0);
      if (mCount != Integer.MAX_VALUE) {
        return Z.valueOf(mCount);
      }
    }
  }
}
