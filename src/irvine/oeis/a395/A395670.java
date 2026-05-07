package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A083566.
 * @author Sean A. Irvine
 */
public class A395670 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A395670() {
    super(1, x -> {
      final Z t = Functions.SIGMA1.z(x).multiply(Functions.DEDEKIND_PSI.z(x)).subtract(x * x);
      return t.signum() > 0 && Predicates.SQUARE.is(t);
    });
  }
}
