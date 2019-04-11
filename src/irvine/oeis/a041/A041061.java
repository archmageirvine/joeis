package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041061 Denominators of continued fraction convergents to <code>sqrt(37)</code>.
 * @author Sean A. Irvine
 */
public class A041061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041061() {
    super(new long[] {1, 12}, new long[] {1, 12});
  }
}
