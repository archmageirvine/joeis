package irvine.oeis.a393;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a052.A052486;

/**
 * A393941 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A393941 extends FilterSequence {

  /** Construct the sequence. */
  public A393941() {
    super(1, new A052486(), Predicates.DISTINCT_EXPONENTS::is);
  }
}
