package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217855 Numbers m such that 16*m*(3*m+1)+1 is a square.
 * @author Sean A. Irvine
 */
public class A217855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217855() {
    super(new long[] {1, -15, 15}, new long[] {0, 2, 30});
  }
}
