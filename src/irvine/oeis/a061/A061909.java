package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061909 Skinny numbers: numbers n such that there are no carries when n is squared by "long multiplication".
 * @author Sean A. Irvine
 */
public class A061909 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final long ds = Functions.DIGIT_SUM.l(mN);
      if (ds * ds == Functions.DIGIT_SUM.l(mN.square())) {
        return mN;
      }
    }
  }
}
