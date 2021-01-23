package irvine.oeis.a019;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a058.A058265;

/**
 * A019712 Continued fraction expansion of tribonacci constant A058265.
 * @author Sean A. Irvine
 */
public class A019712 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A019712() {
    super(new A058265());
  }
}
