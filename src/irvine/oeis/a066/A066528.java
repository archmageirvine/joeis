package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A066528 Non-palindromic triangular numbers whose reverse is a triangular number with the same number of digits.
 * @author Sean A. Irvine
 */
public class A066528 extends Sequence1 {

  private final Sequence mT = new A000217();

  @Override
  public Z next() {
    while (true) {
      final Z t = mT.next();
      if (t.mod(10) != 0) {
        final Z r = Functions.REVERSE.z(t);
        if (!r.equals(t) && ZUtils.isTriangular(r)) {
          return t;
        }
      }
    }
  }
}
