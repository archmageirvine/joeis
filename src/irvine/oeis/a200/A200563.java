package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200563.
 * @author Sean A. Irvine
 */
public class A200563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200563() {
    super(new long[] {8, 2, -1}, new long[] {2, 6, -2});
  }
}
