package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicIntArray;

/**
 * A085489 a(n) is the number of subsets of {1,...,n} containing no solutions to x+y=z with x and y distinct (one version of "sum-free subsets").
 * @author Sean A. Irvine
 */
public class A085489 extends Sequence0 {

  private int mN = -1;
  private long mCount = 0;

  private void search(final int[] set, final LongDynamicIntArray forbidden, final int pos) {
    ++mCount;
    for (int k = pos == 0 ? 1 : set[pos - 1] + 1; k <= mN; ++k) {
      if (forbidden.get(k) == 0) {
        for (int j = 0; j < pos; ++j) {
          forbidden.increment(k + set[j]);
        }
        set[pos] = k;
        search(set, forbidden, pos + 1);
        for (int j = 0; j < pos; ++j) {
          forbidden.add(k + set[j], -1);
        }
      }
    }
  }

  @Override
  public Z next() {
    mCount = 0;
    search(new int[++mN], new LongDynamicIntArray(), 0);
    return Z.valueOf(mCount);
  }
}
