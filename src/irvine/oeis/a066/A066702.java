package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A066702 Square numbers whose reverse is triangular with the same number of digits.
 * @author Sean A. Irvine
 */
public class A066702 extends Sequence1 {

  private final Sequence mSquares = new A000290();

  @Override
  public Z next() {
    while (true) {
      final Z sq = mSquares.next();
      if (sq.isZero()) {
        return sq;
      }
      if (sq.mod(10) != 0 && ZUtils.isTriangular(Functions.REVERSE.z(sq))) {
        return sq;
      }
    }
  }
}
