package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060030 If the numbers a(1)...a(n) contain a hole, then a(n+1) is the largest hole; otherwise a(n+1) = a(n-1) + a(n).
 * @author Sean A. Irvine
 */
public class A060030 extends Sequence1 {

  private static final long[] SMALL = {1, 2, 3, 5, 4, 9};
  private int mN = 0;
  private long mM = 9;
  private long mA = 5;
  private long mB = 3;

  @Override
  public Z next() {
    if (mN < SMALL.length) {
      return Z.valueOf(SMALL[mN++]);
    }
    if (--mM <= mA) {
      final long t = 2 * mB + 3;
      mB = mA;
      mA = t;
      mM = 2 * mM + 3;
    }
    return Z.valueOf(mM);
  }
}
