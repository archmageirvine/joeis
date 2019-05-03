package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048511 <code>a(n) = T(6,n)</code>, array T given by <code>A048505</code>.
 * @author Sean A. Irvine
 */
public class A048511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048511() {
    super(new long[] {-8, 20, -18, 7}, new long[] {1, 50, 163, 421});
  }
}
