package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041259 Denominators of continued fraction convergents to sqrt(141).
 * @author Sean A. Irvine
 */
public class A041259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041259() {
    super(new long[] {-1, 0, 0, 0, 190, 0, 0, 0}, new long[] {1, 1, 7, 8, 183, 191, 1329, 1520});
  }
}
