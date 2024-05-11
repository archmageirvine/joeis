package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A061455 Triangular numbers whose digit reversal is also a triangular number.
 * @author Sean A. Irvine
 */
public class A061455 extends A000217 {

  /** Construct the sequence. */
  public A061455() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Predicates.TRIANGULAR.is(Functions.REVERSE.z(t))) {
        return t;
      }
    }
  }
}

