package irvine.oeis.a386;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a025.A025487;

/**
 * A386526 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A386526 extends FilterSequence {

  /** Construct the sequence. */
  public A386526() {
    super(1, new A025487(), k -> !Predicates.SQUARE_FREE.is(k.subtract(1)) && !Predicates.SQUARE_FREE.is(k.add(1)));
  }
}

