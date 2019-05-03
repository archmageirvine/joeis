package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123942 The <code>(1,4)-entry</code> in the <code>4 X 4</code> matrix <code>M^n</code>, where <code>M={{3, 2, 1, 1}, {2, 1, 1, 0}, {1, 1, 0, 0}, {1, 0, 0, 0}} (n&gt;=0)</code>.
 * @author Sean A. Irvine
 */
public class A123942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123942() {
    super(new long[] {-1, -1, 4, 4}, new long[] {0, 1, 3, 15});
  }
}
