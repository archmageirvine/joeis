package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041159 Denominators of continued fraction convergents to <code>sqrt(89)</code>.
 * @author Sean A. Irvine
 */
public class A041159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041159() {
    super(new long[] {1, 0, 0, 0, 0, 1000, 0, 0, 0, 0}, new long[] {1, 2, 7, 23, 53, 977, 2007, 6998, 23001, 53000});
  }
}
