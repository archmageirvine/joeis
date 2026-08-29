package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002110;

/**
 * A086357 Fixed point if the nonzero-digit-product function is iterating starting from the n-th primorial A002110(n).
 * @author Sean A. Irvine
 */
public class A086357 extends Sequence1 {

  private final Sequence mA = new A002110().skip();

  @Override
  public Z next() {
    Z t = mA.next();
    while (true) {
      final Z u = t;
      t = Functions.DIGIT_NZ_PRODUCT.z(t);
      if (t.equals(u)) {
        return t;
      }
    }
  }
}
