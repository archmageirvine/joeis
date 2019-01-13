package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217855.
 * @author Sean A. Irvine
 */
public class A217855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217855() {
    super(new long[] {1, -15, 15}, new long[] {0, 2, 30});
  }
}
