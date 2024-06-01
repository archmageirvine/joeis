package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067173 Numbers n such that the sum of the prime factors of n equals the product of the digits of n.
 * @author Sean A. Irvine
 */
public class A067173 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      long t = Functions.DIGIT_PRODUCT.l(++mN);
      if (t != 0) {
        for (final Z p : Jaguar.factor(mN).toZArray()) {
          t -= p.longValue();
        }
        if (t == 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
