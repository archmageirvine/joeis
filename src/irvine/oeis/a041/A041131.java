package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041131 Denominators of continued fraction convergents to <code>sqrt(74)</code>.
 * @author Sean A. Irvine
 */
public class A041131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041131() {
    super(new long[] {1, 0, 0, 0, 0, 86, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 5, 83, 88, 171, 259, 430});
  }
}
