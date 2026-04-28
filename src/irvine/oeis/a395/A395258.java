package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A395258 allocated for Aied Sulaiman.
 * @author Sean A. Irvine
 */
public class A395258 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A395258() {
    super(1, 15, 2, k-> Predicates.PRIME.is(k - 2) && Predicates.PRIME.is(k + 2) && Predicates.PRIME.is(Functions.GCD.z(k, Functions.SIGMA1.z(k))));
  }
}
