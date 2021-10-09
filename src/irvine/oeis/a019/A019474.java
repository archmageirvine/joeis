package irvine.oeis.a019;

import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.a030.A030178;

/**
 * A019474 Continued fraction expansion of W(1), where W(x) is the Lambert W function (the root of w*exp(w) = x).
 * @author Sean A. Irvine
 */
public class A019474 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A019474() {
    super(new A030178());
  }
}
