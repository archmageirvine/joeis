package irvine.oeis.a080;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A080758.
 * @author Sean A. Irvine
 */
public class A080790 extends FilterSequence {

  /** Construct the sequence. */
  public A080790() {
    super(1, new A000040(), p -> Predicates.EMIRP.is(2, p));
  }
}
