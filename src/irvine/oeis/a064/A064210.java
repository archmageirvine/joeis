package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064210 Numbers n such that sum of the digits of n is &gt;= the sum of the digits of n^4.
 * @author Sean A. Irvine
 */
public class A064210 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.DIGIT_SUM.l(mN) >= Functions.DIGIT_SUM.l(mN.pow(4))) {
        return mN;
      }
    }
  }
}

