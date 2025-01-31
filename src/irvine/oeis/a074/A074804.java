package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A074804 Kolakoski-(3,2) sequence: a(n) is length of n-th run.
 * @author Sean A. Irvine
 */
public class A074804 extends Sequence1 {

  private final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();
  {
    mA.set(0);
    mA.set(1);
    mA.set(2);
  }
  private long mL = 3; // Length of computed region of mA
  private long mN = -1;
  private long mM = 0; // Position of last run length expanded in mA
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
        } else {
          mL += 3;
        }
      } else if (mNext) {
        mA.set(mL++);
        mA.set(mL++);
      } else {
        mL += 2;
      }
    }
    return mA.isSet(mN) ? Z.THREE : Z.TWO;
  }
}
