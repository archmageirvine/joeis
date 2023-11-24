package irvine.oeis.a066;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066867 Numbers n such that 2^n has 7 as its fourth decimal digit from the right.
 * @author Sean A. Irvine
 */
public class A066867 extends Sequence1 {

  private long mN = 20;

  @Override
  public Z next() {
    while (true) {
      if (LongUtils.modPow(2, ++mN, 10000) / 1000 == 7) {
        return Z.valueOf(mN);
      }
    }
  }
}
