package irvine.oeis.a387;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a055.A055932;

/**
 * A388164.
 * @author Sean A. Irvine
 */
public class A387901 extends FilterSequence {

  /** Construct the sequence. */
  public A387901() {
    super(1, new A055932(), Predicates.POWERFUL::is);
  }
}
