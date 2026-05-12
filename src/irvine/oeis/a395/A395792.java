package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A395792 allocated for Aied Sulaiman.
 * @author Sean A. Irvine
 */
public class A395792 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A395792() {
    super(1, 10, 2, k-> Predicates.PRIME.is(k - 3) && Predicates.PRIME.is(k + 3) && Predicates.PRIME.is(Functions.GCD.z(k, Functions.SIGMA1.z(k))));
  }
}
