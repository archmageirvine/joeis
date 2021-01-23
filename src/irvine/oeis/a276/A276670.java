package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276670 Numerator of (n-1)*n*(n+1)/4.
 * @author Sean A. Irvine
 */
public class A276670 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276670() {
    super(new long[] {-1, 0, 0, 0, 4, 0, 0, 0, -6, 0, 0, 0, 4, 0, 0, 0}, new long[] {0, 0, 3, 6, 15, 30, 105, 84, 126, 180, 495, 330, 429, 546, 1365, 840});
  }
}
