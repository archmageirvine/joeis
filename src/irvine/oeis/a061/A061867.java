package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A061867 Squares whose product of digits is also a square (allowing zeros).
 * @author Sean A. Irvine
 */
public class A061867 extends A000290 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z square = super.next();
      if (Functions.DIGIT_PRODUCT.z(square).isSquare()) {
        return square;
      }
    }
  }
}
