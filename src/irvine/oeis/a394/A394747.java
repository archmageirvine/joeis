package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A394747 Numbers k such that k-4 and k+4 are prime and gcd(k, sigma(k)) is prime.
 * @author Sean A. Irvine
 */
public class A394747 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A394747() {
    super(1, 15, 2, k-> Predicates.PRIME.is(k - 4) && Predicates.PRIME.is(k + 4) && Predicates.PRIME.is(Functions.GCD.z(k, Functions.SIGMA1.z(k))));
  }
}
