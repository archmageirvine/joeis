package irvine.oeis.a039;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a160.A160155;

/**
 * A039922 Continued fraction for root of x^5 - x - 1.
 * @author Sean A. Irvine
 */
public class A039922 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A039922() {
    super(new A160155());
  }
}
