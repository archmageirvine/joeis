package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062346.
 * @author Sean A. Irvine
 */
public class A062346 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062346() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {3, 45, 210, 630, 1485});
  }
}
