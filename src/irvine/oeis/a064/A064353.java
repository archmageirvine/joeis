package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A064353 Kolakoski-(1,3) sequence: the alphabet is {1,3}, and a(n) is the length of the n-th run.
 * @author Sean A. Irvine
 */
public class A064353 extends Sequence1 {

  private final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();
  {
    mA.set(1);
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
        } else {
          mL += 3;
        }
      } else if (mNext) {
        mA.set(mL++);
      } else {
        ++mL;
      }
    }
    return mA.isSet(mN) ? Z.THREE : Z.ONE;
  }
}
