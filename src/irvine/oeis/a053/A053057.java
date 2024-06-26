package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A053057 Squares whose digit sum is also a square.
 * @author Sean A. Irvine
 */
public class A053057 extends A000290 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z square = super.next();
      final long d = Functions.DIGIT_SUM.l(square);
      final long s = Functions.SQRT.l(d);
      if (s * s == d) {
        return square;
      }
    }
  }
}
