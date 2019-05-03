package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048506 <code>a(n) = T(0,n)</code>, array T given by <code>A048505</code>.
 * @author Sean A. Irvine
 */
public class A048506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048506() {
    super(new long[] {-8, 20, -18, 7}, new long[] {1, 2, 7, 25});
  }
}
