package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057587.
 * @author Sean A. Irvine
 */
public class A057587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057587() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 1, 3, 5, 12, 15, 30});
  }
}
