package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000984;

/**
 * A086356 Fixed point if the nonzero-digit-product function is iterated starting from the central binomial coefficient C(2n,n).
 * @author Sean A. Irvine
 */
public class A086356 extends Sequence1 {

  private final Sequence mA = new A000984().skip();

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
