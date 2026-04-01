package irvine.oeis.a394;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a052.A052486;

/**
 * A394482 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A394482 extends FilterSequence {

  /** Construct the sequence. */
  public A394482() {
    super(1, new A052486(), k -> !Predicates.INDIVISIBLE.is(k));
  }
}

