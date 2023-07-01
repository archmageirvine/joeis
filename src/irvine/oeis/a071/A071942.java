package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A071942 Kolakoski-(3,4) sequence: a(n) is length of n-th run.
 * @author Sean A. Irvine
 */
public class A071942 extends Sequence1 {

  private final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();
  private long mL = 3; // Length of computed region of mA
  private long mN = -1;
  private long mM = 0; // Position of last run length expanded in mA
  private boolean mNext = false;

  @Override
  public Z next() {
    if (++mN >= mL) {
      mNext = !mNext;
      if (mA.isSet(++mM)) {
        if (mNext) {
          mA.set(mL++);
          mA.set(mL++);
          mA.set(mL++);
          mA.set(mL++);
        } else {
          mL += 4;
        }
      } else if (mNext) {
        mA.set(mL++);
        mA.set(mL++);
        mA.set(mL++);
      } else {
        mL += 3;
      }
    }
    return mA.isSet(mN) ? Z.FOUR : Z.THREE;
  }
}
