package irvine.oeis.a352;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A352531 Numbers with multiplicative persistence value 10.
 * @author Georg Fischer
 */
public class A352531 extends Sequence1 {

  private Z mN = Z.valueOf(3778888998L);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.DIGIT_PRODUCT_PERSISTENCE.l(mN) == 10) {
        return mN;
      }
    }
  }
}
