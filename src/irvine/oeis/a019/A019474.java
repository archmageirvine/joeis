package irvine.oeis.a019;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a030.A030178;

/**
 * A019474 Continued fraction expansion of <code>W(1)</code>, where <code>W(x)</code> is the Lambert W function (the root of w*exp(w) <code>= x)</code>.
 * @author Sean A. Irvine
 */
public class A019474 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A019474() {
    super(new A030178());
  }
}
