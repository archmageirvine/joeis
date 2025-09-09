package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A387170 Self-inventory sequence modulo 10: start with 0; repeatedly append the counts of digits 0..9 seen so far, taken mod 10.
 * @author Sean A. Irvine
 */
public class A387170 extends Sequence0 {

  private final int[] mCounts = new int[10];
  private int mN = -2;

  @Override
  public Z next() {
    if (++mN == mCounts.length) {
      mN = 0;
    }
    if (mN < 0) {
      mCounts[0] = 1;
      return Z.ZERO;
    }
    final int r = mCounts[mN];
    mCounts[r] = (mCounts[r] + 1) % mCounts.length;
    return Z.valueOf(r);
  }
}

