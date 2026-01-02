package irvine.oeis.a082;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a382.A382239;

/**
 * A082943 Positive numbers not divisible by any of their digits nor by the sum of their digits.
 * @author Sean A. Irvine
 */
public class A082943 extends FilterSequence {

  /** Construct the sequence. */
  public A082943() {
    super(1, new A382239(), k -> Predicates.ZEROLESS.is(k));
  }
}
