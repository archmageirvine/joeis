package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A066742 Square numbers not divisible by 10 whose reverse is pentagonal.
 * @author Sean A. Irvine
 */
public class A066742 extends Sequence1 {

  private final Sequence mSquares = new A000290();

  @Override
  public Z next() {
    while (true) {
      final Z s = mSquares.next();
      if (s.isZero()) {
        return s;
      }
      if (s.mod(10) != 0) {
        final Z r = Functions.REVERSE.z(s);
        if (Predicates.POLYGONAL.is(5, r)) {
          return s;
        }
      }
    }
  }
}
