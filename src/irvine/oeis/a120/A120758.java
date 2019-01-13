package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120758.
 * @author Sean A. Irvine
 */
public class A120758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120758() {
    super(new long[] {-1, 7, 3}, new long[] {1, 6, 25});
  }
}
