package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064520 a(n) = + 1 - 2 - 3 + 4 + 5 + 6 - 7 - 8 - 9 - 10 + 11 + 12 + 13 + 14 + 15 - ... + (+-1)*n, where there is one plus, two minuses, three pluses, etc. (see A002024).
 * @author Sean A. Irvine
 */
public class A064520 extends Sequence1 {

  private Z mSum = Z.ZERO;
  private boolean mSign = true;
  private long mCount = 1;
  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    if (--mM < 0) {
      mSign = !mSign;
      mM = mCount;
      ++mCount;
    }
    mSum = mSum.signedAdd(mSign, Z.valueOf(++mN));
    return mSum;
  }
}

