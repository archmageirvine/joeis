package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002145;

/**
 * A389481 Primes that remain prime when their binary digits are rotated once to the right.
 * @author Sean A. Irvine
 */
public class A389481 extends FilterSequence {

  /** Construct the sequence. */
  public A389481() {
    super(1, new A002145(), p -> Predicates.PRIME.is(Functions.ROTATE_RIGHT.z(2, p)));
  }
}
