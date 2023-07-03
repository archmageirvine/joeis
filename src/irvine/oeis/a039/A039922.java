package irvine.oeis.a039;

import irvine.oeis.a160.A160155;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A039922 Continued fraction for root of x^5 - x - 1.
 * @author Sean A. Irvine
 */
public class A039922 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A039922() {
    super(0, new A160155());
  }
}
