package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106434 The <code>(1,1)-entry</code> of the matrix <code>A^n</code>, where A <code>= [0,1;2,3]</code>.
 * @author Sean A. Irvine
 */
public class A106434 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106434() {
    super(new long[] {2, 3}, new long[] {0, 2});
  }
}
