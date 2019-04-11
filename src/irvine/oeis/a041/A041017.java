package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041017 Denominators of continued fraction convergents to <code>sqrt(12)</code>.
 * @author Sean A. Irvine
 */
public class A041017 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041017() {
    super(new long[] {-1, 0, 14, 0}, new long[] {1, 2, 13, 28});
  }
}
