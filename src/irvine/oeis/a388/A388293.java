package irvine.oeis.a388;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a052.A052486;

/**
 * A080601.
 * @author Sean A. Irvine
 */
public class A388293 extends FilterSequence {

  /** Construct the sequence. */
  public A388293() {
    super(1, new A052486(), Predicates.CUBEFUL::is);
  }
}
