package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157446 <code>a(n) = 16*n^2 -</code> n.
 * @author Sean A. Irvine
 */
public class A157446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157446() {
    super(new long[] {1, -3, 3}, new long[] {15, 62, 141});
  }
}
