package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048482 <code>a(n) = T(n,n)</code>, array T given by A048472.
 * @author Sean A. Irvine
 */
public class A048482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048482() {
    super(new long[] {-8, 20, -18, 7}, new long[] {1, 3, 13, 49});
  }
}
