package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A395159 allocated for Daniel Hoyt.
 * @author Sean A. Irvine
 */
public class A395159 extends Sequence1 {

  private final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();
  private long mN = -1;
  private long mM = 2;

  @Override
  public Z next() {
    if (++mN >= mM) {
      for (long k = mM - 1; k >= 0; --k) {
        if (k == mM - 1) {
          if (mA.isSet(k)) {
            // 22 -> 1
            assert mA.isSet(k - 1);
            --k;
            ++mM;
          } else {
            // 1 -> 22
            mA.set(mM++);
            mA.set(mM++);
          }
        } else if (k == 1 && mA.isSet(1)) {
          ++mM;
          break;
        } else if (k == 0) {
          // 1 -> 22
          mA.set(mM++);
          mA.set(mM++);
        } else {
          if (mA.isSet(k)) {
            mA.set(mM);
          }
          ++mM;
        }
      }
    }
    return mA.isSet(mN) ? Z.TWO : Z.ONE;
  }
}
