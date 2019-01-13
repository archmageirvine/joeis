package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120940.
 * @author Sean A. Irvine
 */
public class A120940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120940() {
    super(new long[] {-1, -3, -1, 3, 1}, new long[] {0, 1, 3, 6, 14});
  }
}
