package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;
import irvine.util.array.DynamicArray;

/**
 * A031885 Lucky numbers with smallest increasing gaps (upper terms).
 * @author Sean A. Irvine
 */
public class A031885 extends A000959 {

  private final DynamicArray<Z> mFirst = new DynamicArray<>();
  private int mN = 0;
  private Z mA = super.next();

  @Override
  public Z next() {
    ++mN;
    while (mFirst.get(mN) == null) {
      final Z t = mA;
      mA = super.next();
      final int d = mA.subtract(t).divide2().intValueExact();
      if (mFirst.get(d) == null) {
        mFirst.set(d, mA);
      }
    }
    return mFirst.get(mN);
  }
}
