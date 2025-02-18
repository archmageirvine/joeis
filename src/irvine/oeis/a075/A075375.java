package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A075375 Rearrangement of natural numbers so that every term is relatively prime to the sum of its neighbors.
 * @author Sean A. Irvine
 */
public class A075375 extends Sequence1 {

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
    long k = 2;
    while (true) {
      if (!mUsed.isSet(++k)) {
        final Z t = mA.add(k);
        if (Functions.GCD.z(t, mB).equals(Z.ONE)) {
          mUsed.set(k);
          mA = mB;
          mB = Z.valueOf(k);
          return mB;
        }
      }
    }
  }
}
