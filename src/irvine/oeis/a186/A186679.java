package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186679.
 * @author Sean A. Irvine
 */
public class A186679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186679() {
    super(new long[] {1, -1, 0, -1}, new long[] {0, -3, 4, -4});
  }
}
