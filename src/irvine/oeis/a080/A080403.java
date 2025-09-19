package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;

/**
 * A080403 Numbers n such that both A000203(n) and A001157(n) are squarefree: sum of divisors and squares of divisors of n are squarefree.
 * @author Sean A. Irvine
 */
public class A080403 extends FilterSequence {

  /** Construct the sequence. */
  public A080403() {
    super(1, new A080401(), k -> Predicates.SQUARE_FREE.is(Functions.SIGMA1.z(k)));
  }
}
