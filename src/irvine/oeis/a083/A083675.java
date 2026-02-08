package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000217;

/**
 * A083675 Triangular numbers whose sum of aliquot divisors is also a triangular number.
 * @author Sean A. Irvine
 */
public class A083675 extends FilterSequence {

  /** Construct the sequence. */
  public A083675() {
    super(1, new A000217(), k -> Predicates.TRIANGULAR.is(Functions.ALIQUOT.z(k)));
  }
}
