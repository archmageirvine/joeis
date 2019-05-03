package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123943 The <code>(1,5)-entry</code> in the <code>5 X 5</code> matrix <code>M^n</code>, where <code>M={{5, 3, 2, 1, 1}, {3, 2, 1, 1, 0}, {2, 1, 1, 0, 0}, {1, 1, 0, 0, 0}, {1, 0, 0, 0, 0}}</code>.
 * @author Sean A. Irvine
 */
public class A123943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123943() {
    super(new long[] {1, 0, -6, 0, 8}, new long[] {0, 1, 5, 40, 315});
  }
}
