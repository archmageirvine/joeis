package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041093 Denominators of continued fraction convergents to <code>sqrt(54)</code>.
 * @author Sean A. Irvine
 */
public class A041093 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041093() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 970, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 20, 23, 66, 947, 1960, 2907, 19402, 22309, 64020});
  }
}
