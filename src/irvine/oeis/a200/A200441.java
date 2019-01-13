package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200441.
 * @author Sean A. Irvine
 */
public class A200441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200441() {
    super(new long[] {-1, 33}, new long[] {1, 33});
  }
}
