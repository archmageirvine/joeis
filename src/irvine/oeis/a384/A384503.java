package irvine.oeis.a384;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A384503 allocated for David James Sycamore.
 * @author Sean A. Irvine
 */
public class A384503 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.TWO;
      return Z.TWO;
    }
    if (mA.isOne()) {
      mA = mB;
      mB = Z.THREE;
      return Z.THREE;
    }
    final Z d = Functions.GCD.z(mA, mB);
    long k = 3;
    if (d.isOne()) {
      while (mUsed.isSet(++k) || Functions.GCD.z(mA, k).isOne()) {
        // do nothing
      }
    } else {
      while (mUsed.isSet(++k) || !Functions.GCD.z(mB, k).isOne()) {
        // do nothing
      }
    }
    mUsed.set(k);
    mA = mB;
    mB = Z.valueOf(k);
    return mB;
  }
}

