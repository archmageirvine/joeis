package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A394731 allocated for Ctibor O. Zizka.
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
