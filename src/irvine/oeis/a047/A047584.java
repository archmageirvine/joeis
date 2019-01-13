package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047584.
 * @author Sean A. Irvine
 */
public class A047584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047584() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 3, 5, 6, 7, 9});
  }
}
