package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A394731 Numbers k such that k*(k + 1)/2 + d is a triangular number (A000217), where d &gt; (k + 1) is a divisor of k*(k + 1)/2.
 * @author Sean A. Irvine
 */
public class A394731 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A394731() {
    super(1, k -> {
      final Z tk = Functions.TRIANGULAR.z(k);
      for (final Z d : Jaguar.factor(tk).divisors()) {
        if (d.compareTo(k + 1) > 0 && Predicates.TRIANGULAR.is(tk.add(d))) {
          return true;
        }
      }
      return false;
    });
  }
}
