package irvine.oeis.a391;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a390.A390574;

/**
 * A391874 allocated for Charles L. Hohn.
 * @author Sean A. Irvine
 */
public class A391874 extends FilterSequence {

  /** Construct the sequence. */
  public A391874() {
    super(new A390574(), k -> !Predicates.SQUARE.is(k));
  }
}
