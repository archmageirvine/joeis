package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066153 (product of digits of n) * (sum of digits of n) = 4n.
 * @author Sean A. Irvine
 */
public class A066153 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final long v = ++mN;
      if (Functions.DIGIT_SUM.l(v) * Functions.DIGIT_PRODUCT.l(mN) == 4 * mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
