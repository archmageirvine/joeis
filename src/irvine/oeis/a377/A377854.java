package irvine.oeis.a377;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a052.A052486;

/**
 * A377854 Achilles numbers whose squarefree kernel is a primorial.
 * @author Sean A. Irvine
 */
public class A377854 extends FilterSequence {

  /** Construct the sequence. */
  public A377854() {
    super(1, new A052486(), k -> Predicates.PRIMORIAL.is(Functions.SQUARE_FREE_KERNEL.z(k)));
  }
}
