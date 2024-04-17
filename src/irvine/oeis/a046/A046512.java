package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046512 Numbers with multiplicative persistence value 3.
 * @author Sean A. Irvine
 */
public class A046512 extends Sequence1 {

  private Z mN = Z.valueOf(38);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.DIGIT_PRODUCT_PERSISTENCE.l(mN) == 3) {
        return mN;
      }
    }
  }
}
