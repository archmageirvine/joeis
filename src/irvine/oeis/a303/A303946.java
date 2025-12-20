package irvine.oeis.a303;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a007.A007916;

/**
 * A303946 Numbers that are neither squarefree nor perfect powers.
 * @author Sean A. Irvine
 */
public class A303946 extends FilterSequence {

  /** Construct the sequence. */
  public A303946() {
    super(1, new A007916(), k -> !Predicates.SQUARE_FREE.is(k));
  }
}
