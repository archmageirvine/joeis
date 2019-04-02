package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042737 Denominators of continued fraction convergents to sqrt(898).
 * @author Sean A. Irvine
 */
public class A042737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042737() {
    super(new long[] {-1, 0, 0, 0, 1798, 0, 0, 0}, new long[] {1, 1, 29, 30, 1769, 1799, 52141, 53940});
  }
}
