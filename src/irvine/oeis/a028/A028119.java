package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028119.
 * @author Sean A. Irvine
 */
public class A028119 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028119() {
    super(new long[] {-1680, 1136, -275, 28}, new long[] {1, 28, 509, 7688});
  }
}
