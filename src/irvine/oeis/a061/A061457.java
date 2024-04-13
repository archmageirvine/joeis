package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A061457 Squares whose reversal is also a square.
 * @author Sean A. Irvine
 */
public class A061457 extends A000290 {

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Functions.REVERSE.z(t).isSquare()) {
        return t;
      }
    }
  }
}

