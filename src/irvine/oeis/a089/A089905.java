package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089905.
 * @author Sean A. Irvine
 */
public class A089905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089905() {
    super(new long[] {-100, 220, -141, 22}, new long[] {0, 6, 183, 3285});
  }
}
