package irvine.oeis.a352;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A352532 Numbers with multiplicative persistence value 11.
 * @author Georg Fischer
 */
public class A352532 extends Sequence1 {

  private Z mN = Z.valueOf(277777788888898L);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.DIGIT_PRODUCT_PERSISTENCE.l(mN) == 11) {
        return mN;
      }
    }
  }
}
