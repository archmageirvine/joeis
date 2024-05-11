package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A062099 Triangular numbers whose sum of digits is a triangular number.
 * @author Sean A. Irvine
 */
public class A062099 extends A000217 {

  /** Construct the sequence. */
  public A062099() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Predicates.TRIANGULAR.is(Functions.DIGIT_SUM.z(t))) {
        return t;
      }
    }
  }
}
