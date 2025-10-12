package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002145;

/**
 * A389481 allocated for Rhys Feltman.
 * @author Sean A. Irvine
 */
public class A389481 extends FilterSequence {

  /** Construct the sequence. */
  public A389481() {
    super(1, new A002145(), p -> Predicates.PRIME.is(Functions.ROTATE_RIGHT.z(2, p)));
  }
}
