package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157870 a(n) = (4*n+1)*(4*n+2) = (4*n+2)!/(4*n)!.
 * @author Sean A. Irvine
 */
public class A157870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157870() {
    super(new long[] {1, -3, 3}, new long[] {2, 30, 90});
  }
}
