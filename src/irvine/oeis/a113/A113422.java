package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113422 <code>a(n) = floor((5*n^2+1)/3)</code>.
 * @author Sean A. Irvine
 */
public class A113422 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113422() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {0, 2, 7, 15, 27});
  }
}
