package irvine.oeis.a083;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A083358 Square root of n-th perfect square in A083356.
 * @author Sean A. Irvine
 */
public class A083358 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A083358() {
    super(1, new FilterSequence(new A083356(), Predicates.SQUARE::is), Z::sqrt);
  }
}
