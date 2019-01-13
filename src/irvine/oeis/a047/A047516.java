package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047516.
 * @author Sean A. Irvine
 */
public class A047516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047516() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 3, 4, 6, 7, 9});
  }
}
