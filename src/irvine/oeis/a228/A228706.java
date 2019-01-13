package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228706.
 * @author Sean A. Irvine
 */
public class A228706 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228706() {
    super(new long[] {-1, 4, -8, 12, -14, 12, -8, 4}, new long[] {1, 1, 1, 5, 11, 14, 18, 30});
  }
}
