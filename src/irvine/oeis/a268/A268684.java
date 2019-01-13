package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268684.
 * @author Sean A. Irvine
 */
public class A268684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268684() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 2, 14, 44});
  }
}
