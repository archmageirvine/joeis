package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123941 The <code>(1,2)-entry</code> in the <code>3 X 3</code> matrix <code>M^n</code>, where M <code>= {{2, 1, 1}, {1, 1, 0}, {1, 0, 0}}</code>.
 * @author Sean A. Irvine
 */
public class A123941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123941() {
    super(new long[] {-1, 0, 3}, new long[] {0, 1, 3});
  }
}
