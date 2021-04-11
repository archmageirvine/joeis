package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;
import irvine.util.array.LongDynamicArray;

/**
 * A046500 Smallest prime with multiplicative persistence n.
 * @author Sean A. Irvine
 */
public class A046500 extends A000040 {

  private int mN = -1;
  private final LongDynamicArray<Z> mA = new LongDynamicArray<>();

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == null) {
      final Z c = super.next();
      final long persistence = ZUtils.multiplicativePersistence(c);
      if (mA.get(persistence) == null) {
        mA.set(persistence, c);
      }
    }
    return mA.get(mN);
  }
}
