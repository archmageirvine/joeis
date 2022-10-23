package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008364 11-rough numbers: not divisible by 2, 3, 5 or 7.
 * @author Sean A. Irvine
 */
public class A008364 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (mN % 3 != 0 && mN % 5 != 0 && mN % 7 != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}


