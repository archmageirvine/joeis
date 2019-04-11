package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048506 <code>a(n) =</code> T(0,n), array T given by A048505.
 * @author Sean A. Irvine
 */
public class A048506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048506() {
    super(new long[] {-8, 20, -18, 7}, new long[] {1, 2, 7, 25});
  }
}
