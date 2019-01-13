package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277830.
 * @author Sean A. Irvine
 */
public class A277830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277830() {
    super(new long[] {-100, 220, -141, 22}, new long[] {1, 1, 2, 23});
  }
}
