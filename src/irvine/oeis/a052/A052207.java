package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052207 Number of {s(i):i=0..n} such that |s(i)-s(i-1)|=1, i=1..n and s(i)=0 at four values of i, one of which is i=0.
 * @author Sean A. Irvine
 */
public class A052207 implements Sequence {

  private int mN = 0;
  private long mCount = 0;

  // WLOG can assume s1=+1 and multiply by 2 for symmetry

  private void search(final int current, final int numZeros, final int remaining) {
    if (remaining == 0) {
      if (numZeros == 4) {
        ++mCount;
      }
      return;
    }
    if (current == -1) {
      if (numZeros < 4) {
        search(0, numZeros + 1, remaining - 1);
      }
    } else {
      search(current + 1, numZeros, remaining - 1);
    }
    if (current == 1) {
      if (numZeros < 4) {
        search(0, numZeros + 1, remaining - 1);
      }
    } else {
      search(current - 1, numZeros, remaining - 1);
    }
  }

  @Override
  public Z next() {
    if (++mN < 6) {
      return Z.ZERO;
    }
    mCount = 0;
    search(1, 1, mN - 1);
    return Z.valueOf(mCount).multiply2();
  }
}
