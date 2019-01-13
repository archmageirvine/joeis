package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226576.
 * @author Sean A. Irvine
 */
public class A226576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226576() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 3, 3, 1});
  }
}
