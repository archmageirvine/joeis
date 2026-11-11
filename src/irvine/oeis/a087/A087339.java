package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A087339 Numbers k such that both the sum of the digits of k and 1 plus the product of its digits are primes.
 * @author Sean A. Irvine
 */
public class A087339 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A087339() {
    super(1, k -> Predicates.PRIME.is(Functions.DIGIT_SUM.l(k)) && Predicates.PRIME.is(Functions.DIGIT_PRODUCT.z(k).add(1)));
  }
}

