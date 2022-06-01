package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123943 The (1,5)-entry in the 5 X 5 matrix M^n, where M={{5, 3, 2, 1, 1}, {3, 2, 1, 1, 0}, {2, 1, 1, 0, 0}, {1, 1, 0, 0, 0}, {1, 0, 0, 0, 0}}.
 * @author Sean A. Irvine
 */
public class A123943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123943() {
    super(new long[] {1, 0, -6, 0, 8}, new long[] {0, 1, 5, 40, 315});
  }
}
