package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120758 The <code>(1</code>,3)-entry in the matrix M^n, where M is the 3 X 3 matrix <code>[0,2,1</code>; 2,1,2; <code>1,2,2] (n&gt;=1)</code>.
 * @author Sean A. Irvine
 */
public class A120758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120758() {
    super(new long[] {-1, 7, 3}, new long[] {1, 6, 25});
  }
}
