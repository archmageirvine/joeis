package irvine.oeis.a039;

import irvine.oeis.a160.A160389;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A039921 Continued fraction expansion of w = 2*cos(Pi/7).
 * @author Sean A. Irvine
 */
public class A039921 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A039921() {
    super(0, new A160389());
  }
}
