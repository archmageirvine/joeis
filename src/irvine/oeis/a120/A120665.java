package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120665.
 * @author Sean A. Irvine
 */
public class A120665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120665() {
    super(new long[] {2, -9, 6}, new long[] {0, -1, 0});
  }
}
