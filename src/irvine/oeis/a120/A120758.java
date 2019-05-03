package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120758 The <code>(1,3)-entry</code> in the matrix <code>M^n</code>, where M is the <code>3 X 3</code> matrix <code>[0,2,1; 2,1,2; 1,2,2] (n&gt;=1)</code>.
 * @author Sean A. Irvine
 */
public class A120758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120758() {
    super(new long[] {-1, 7, 3}, new long[] {1, 6, 25});
  }
}
