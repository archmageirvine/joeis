package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058369 Numbers k such that k and k^2 have same digit sum.
 * @author Sean A. Irvine
 */
public class A058369 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.DIGIT_SUM.l(mN) == Functions.DIGIT_SUM.l(mN.square())) {
        return mN;
      }
    }
  }
}
