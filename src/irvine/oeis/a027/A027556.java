package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027556 Unbalanced strings of length n.
 * @author Sean A. Irvine
 */
public class A027556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027556() {
    super(new long[] {4, -6, 0, 3}, new long[] {0, 0, 0, 2});
  }
}
