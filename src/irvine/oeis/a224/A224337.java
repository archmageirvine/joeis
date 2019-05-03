package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224337 Number of idempotent <code>6X6 0..n</code> matrices of rank 5.
 * @author Sean A. Irvine
 */
public class A224337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224337() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {378, 2910, 12282, 37494, 93306, 201678});
  }
}
