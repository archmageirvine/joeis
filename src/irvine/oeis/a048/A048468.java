package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048468 <code>a(n) = T(7,n)</code>, array T given by <code>A047858</code>.
 * @author Sean A. Irvine
 */
public class A048468 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048468() {
    super(new long[] {4, -8, 5}, new long[] {1, 9, 26});
  }
}
