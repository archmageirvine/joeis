package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086353 Fixed point if nonzero-digit product of n! is iterated.
 * @author Sean A. Irvine
 */
public class A086353 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    Z t = mF;
    while (true) {
      final Z u = t;
      t = Functions.DIGIT_NZ_PRODUCT.z(t);
      if (t.equals(u)) {
        return t;
      }
    }
  }
}
