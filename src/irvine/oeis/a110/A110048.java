package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110048.
 * @author Sean A. Irvine
 */
public class A110048 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110048() {
    super(new long[] {8, 12, 2}, new long[] {1, 2, 16});
  }
}
