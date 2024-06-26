package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A066569 Triangular numbers whose reverse is also triangular.
 * @author Sean A. Irvine
 */
public class A066569 extends Sequence1 {

  private final Sequence mT = new A000217().skip();

  @Override
  public Z next() {
    while (true) {
      final Z t = mT.next();
      if (t.mod(10) != 0 && Predicates.TRIANGULAR.is(Functions.REVERSE.z(t))) {
        return t;
      }
    }
  }
}
