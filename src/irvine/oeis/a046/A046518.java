package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046518 Numbers with multiplicative persistence value 9.
 * @author Sean A. Irvine
 */
public class A046518 extends Sequence1 {

  private Z mN = Z.valueOf(26888998);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.DIGIT_PRODUCT_PERSISTENCE.l(mN) == 9) {
        return mN;
      }
    }
  }
}
