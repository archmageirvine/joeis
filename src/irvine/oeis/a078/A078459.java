package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078459 Numbers n such that in some base b &lt;= log n the sum of the digits of n in base b equals b.
 * @author Sean A. Irvine
 */
public class A078459 extends Sequence1 {

  private long mN = 8;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long b = 2; b <= Math.log(mN); ++b) {
        if (Functions.DIGIT_SUM.l(b, mN) == b) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

