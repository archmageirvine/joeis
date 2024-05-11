package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A061869 Squares whose sum of digits as well as product of digits is a square (allowing zero).
 * @author Sean A. Irvine
 */
public class A061869 extends A000290 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z square = super.next();
      if (Functions.DIGIT_PRODUCT.z(square).isSquare() && Predicates.SQUARE.is(Functions.DIGIT_SUM.l(square))) {
        return square;
      }
    }
  }
}
