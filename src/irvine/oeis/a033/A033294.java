package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A033294 Squares which when written backwards remain square (final 0's excluded).
 * @author Sean A. Irvine
 */
public class A033294 extends A000290 {

  {
    setOffset(1);
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    while (true) {
      final Z square = super.next();
      if (square.mod(10) != 0 && Functions.REVERSE.z(square).isSquare()) {
        return square;
      }
    }
  }
}

