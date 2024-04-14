package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A066703 Triangular numbers whose reverse is a square with the same number of digits.
 * @author Sean A. Irvine
 */
public class A066703 extends Sequence1 {

  private final Sequence mT = new A000217();

  @Override
  public Z next() {
    while (true) {
      final Z tri = mT.next();
      if (tri.isZero()) {
        return tri;
      }
      if (tri.mod(10) != 0 && Functions.REVERSE.z(tri).isSquare()) {
        return tri;
      }
    }
  }
}
