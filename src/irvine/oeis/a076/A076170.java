package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A076170 Triangular numbers whose largest proper divisor is also triangular.
 * @author Sean A. Irvine
 */
public class A076170 extends Sequence1 {

  private final Sequence mT = new A000217().skip();

  @Override
  public Z next() {
    while (true) {
      final Z t = mT.next();
      if (Predicates.TRIANGULAR.is(t.divide(Functions.LPF.z(t)))) {
        return t;
      }
    }
  }
}

