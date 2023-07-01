package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A071928 Kolakoski-(2,4) sequence: a(n) is length of n-th run.
 * @author Sean A. Irvine
 */
public class A071928 extends Sequence1 {

  private final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();
  {
    mA.set(2);
    mA.set(3);
  }
  private long mL = 4; // Length of computed region of mA
  private long mN = -1;
  private long mM = 1; // Position of last run length expanded in mA
  private boolean mNext = true;

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
      } else {
        mL += 2;
      }
    }
    return mA.isSet(mN) ? Z.FOUR : Z.TWO;
  }
}
