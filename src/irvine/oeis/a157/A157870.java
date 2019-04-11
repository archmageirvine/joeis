package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157870 <code>a(n) = (4n+1)(4n+2) = (4n+2)!/(4n)!</code>.
 * @author Sean A. Irvine
 */
public class A157870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157870() {
    super(new long[] {1, -3, 3}, new long[] {2, 30, 90});
  }
}
