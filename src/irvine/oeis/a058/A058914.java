package irvine.oeis.a058;

import irvine.oeis.a048.A048819;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A058914 Continued fraction expansion of one of four fixed points (mod 1) of Minkowski's question mark function (specifically, the only positive fixed point (mod 1) less than 1/2).
 * @author Sean A. Irvine
 */
public class A058914 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A058914() {
    super(0, new A048819());
  }
}

