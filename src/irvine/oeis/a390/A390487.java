package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A390487 allocated for Benjamin W P Cornish.
 * @author Sean A. Irvine
 */
public class A390487 extends Sequence1 {

  private LongDynamicBooleanArray mA = null;
  private long mN = 0;

  @Override
  public Z next() {
    if (mA == null) {
      mA = new LongDynamicBooleanArray();
    } else {
      final LongDynamicBooleanArray t = mA;
      mA = new LongDynamicBooleanArray();
      final long s = mN * mN; // square of previous term
      mA.set(s); // take 0 coefficient for all the other terms
      for (long k = 1; k < t.length(); ++k) {
        if (t.isSet(k)) {
          mA.set(k); // propagate existing term to next iteration
          mA.set(k + s); // add new square
          mA.set(Math.abs(k - s)); // subtract new square
        }
      }
    }
    while (mA.isSet(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
