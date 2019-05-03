package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157960 <code>a(n) = 121*n^2 -</code> n.
 * @author Sean A. Irvine
 */
public class A157960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157960() {
    super(new long[] {1, -3, 3}, new long[] {120, 482, 1086});
  }
}
