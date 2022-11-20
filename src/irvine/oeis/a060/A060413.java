package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060413 In the '3x+1' problem, take the sequence of starting values which set new records for the "dropping time" (A060412); sequence gives associated dropping times.
 * @author Sean A. Irvine
 */
public class A060413 extends Sequence1 {

  private Z mN = Z.ONE;
  private long mMax = 0;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final long cnt = A060412.droppingTime(mN);
      if (cnt > mMax) {
        mMax = cnt;
        return Z.valueOf(mMax);
      }
    }
  }
}
