package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100191 The <code>(1,1)-entry</code> in the <code>3 X 3</code> matrix <code>M^n</code>, where M <code>= [1,2,1 / 2,2,0 / 1,0,0]</code>.
 * @author Sean A. Irvine
 */
public class A100191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100191() {
    super(new long[] {-2, 3, 3}, new long[] {1, 6, 19});
  }
}
