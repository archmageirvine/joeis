package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A066647 Squares of the form a^2 + b^3 with a, b &gt; 0.
 * @author Sean A. Irvine
 */
public class A066647 extends Sequence1 {

  private final Sequence mSquares = new A000290();

  private boolean is(final Z s) {
    long k = 0;
    Z c;
    while ((c = s.subtract(Z.valueOf(++k).pow(3))).signum() > 0) {
      if (c.isSquare()) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z s = mSquares.next();
      if (is(s)) {
        return s;
      }
    }
  }
}
