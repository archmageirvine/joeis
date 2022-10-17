package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A060000 If the numbers a(1)...a(n) contain a hole, then a(n+1) is the smallest hole; otherwise a(n+1) = a(n-1) + a(n).
 * @author Sean A. Irvine
 */
public class A060000 implements Sequence {

  // After Alfred Heiligenbrunner

  private static final long[] SMALL = {1, 2, 3, 5, 4, 9};
  private int mN = 0;
  private long mM = 5;
  private long mA = 9;

  @Override
  public Z next() {
    if (mN < SMALL.length) {
      return Z.valueOf(SMALL[mN++]);
    }
    if (++mM < mA) {
      return Z.valueOf(mM);
    } else {
      mA = 2 * mA - 3;
      return Z.valueOf(mA);
    }
  }
}
