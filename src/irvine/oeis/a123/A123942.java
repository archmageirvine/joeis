package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123942 The (1,4)-entry in the 4 X 4 matrix M^n, where M={{3, 2, 1, 1}, {2, 1, 1, 0}, {1, 1, 0, 0}, {1, 0, 0, 0}} (n&gt;=0).
 * @author Sean A. Irvine
 */
public class A123942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123942() {
    super(new long[] {-1, -1, 4, 4}, new long[] {0, 1, 3, 15});
  }
}
