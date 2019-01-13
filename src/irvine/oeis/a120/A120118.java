package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120118.
 * @author Sean A. Irvine
 */
public class A120118 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120118() {
    super(new long[] {-1, 0, -1, 0, 0, 2, 0, 1, 0, 1}, new long[] {2, 4, 7, 11, 16, 26, 43, 71, 116, 186});
  }
}
