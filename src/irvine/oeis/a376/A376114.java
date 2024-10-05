package irvine.oeis.a376;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a033.A033950;

/**
 * A072106.
 * @author Sean A. Irvine
 */
public class A376114 extends FilterSequence {

  /** Construct the sequence. */
  public A376114() {
    super(1, new A033950(), k -> k.isEven() && Predicates.SQUARE.is(k.divide2()));
  }
}

