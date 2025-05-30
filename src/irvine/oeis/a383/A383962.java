package irvine.oeis.a383;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A381847.
 * @author Sean A. Irvine
 */
public class A383962 extends Sequence1 {

  private long mN = 0;
  private int mM = 0;
  private Z[] mD = {};

  @Override
  public Z next() {
    while (true) {
      if (++mM >= mD.length) {
        mD = Jaguar.factor(++mN).divisorsSorted();
        mM = 0;
      }
      if (mD[mM].isOdd()) {
        return Z.valueOf(mM + 1);
      }
    }
  }
}

