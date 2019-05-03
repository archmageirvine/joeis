package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120775 The <code>(3,1)-entry</code> of the matrix <code>M^n</code>, where M is the <code>3 X 3</code> matrix <code>[0,1,1; 2,1,2; 1,2,2] (n&gt;=1)</code>.
 * @author Sean A. Irvine
 */
public class A120775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120775() {
    super(new long[] {1, 5, 3}, new long[] {1, 6, 23});
  }
}
