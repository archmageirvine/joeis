package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a046.A046704;

/**
 * A087340 Primes p such that the sum of the digits of p as well as 1 plus the product of its digits are also primes.
 * @author Sean A. Irvine
 */
public class A087340 extends FilterSequence {

  /** Construct the sequence. */
  public A087340() {
    super(1, new A046704(), p -> Predicates.PRIME.is(Functions.DIGIT_PRODUCT.z(p).add(1)));
  }
}

