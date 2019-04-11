package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041925 Denominators of continued fraction convergents to <code>sqrt(485)</code>.
 * @author Sean A. Irvine
 */
public class A041925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041925() {
    super(new long[] {1, 44}, new long[] {1, 44});
  }
}
