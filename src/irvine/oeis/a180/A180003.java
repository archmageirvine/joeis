package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180003.
 * @author Sean A. Irvine
 */
public class A180003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180003() {
    super(new long[] {1, -1, 0, -38, 38, 0, 1}, new long[] {1, 2, 7, 13, 56, 247, 475});
  }
}
