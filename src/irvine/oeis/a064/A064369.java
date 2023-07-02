package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.util.array.DynamicLongArray;

/**
 * A064369 Smallest integer in Recam\u00e1n's sequence (A005132) to appear n times.
 * @author Sean A. Irvine
 */
public class A064369 extends A064284 {

  private final DynamicLongArray mA = new DynamicLongArray();
  private long mM = -1;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    while (mA.get(mN) == 0) {
      final int cnt = super.next().intValueExact();
      ++mM;
      if (mA.get(cnt) == 0) {
        mA.set(cnt, mM);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}

