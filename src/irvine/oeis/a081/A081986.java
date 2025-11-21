package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A081986 a(n) = {A081984(n)-1}/d, where d is the product of nonzero digits of A081984(n).
 * @author Sean A. Irvine
 */
public class A081986 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z d = Functions.DIGIT_NZ_PRODUCT.z(p);
      final Z[] qr = p.subtract(1).divideAndRemainder(d);
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}
