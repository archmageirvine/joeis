package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A066528.
 * @author Sean A. Irvine
 */
public class A069673 extends Sequence1 {

  private final Sequence mT = new A000217();

  @Override
  public Z next() {
    while (true) {
      final Z t = mT.next();
      final Z r = Functions.REVERSE.z(t);
      if (!r.equals(t) && Predicates.TRIANGULAR.is(r)) {
        return t;
      }
    }
  }
}
