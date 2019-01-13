package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200541.
 * @author Sean A. Irvine
 */
public class A200541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200541() {
    super(new long[] {1, -1, 2, 5, 4, 1}, new long[] {1, 1, 4, 12, 35, 104});
  }
}
