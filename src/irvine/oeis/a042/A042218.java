package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042218 Numerators of continued fraction convergents to <code>sqrt(635)</code>.
 * @author Sean A. Irvine
 */
public class A042218 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042218() {
    super(new long[] {-1, 0, 252, 0}, new long[] {25, 126, 6325, 31751});
  }
}
