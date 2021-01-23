package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131358 a(3*k) = 0, a(3*k+1) = k+1, a(3*k+2) = -k.
 * @author Sean A. Irvine
 */
public class A131358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131358() {
    super(new long[] {1, 1, 1, -1, -1}, new long[] {0, 1, 0, 0, 2});
  }
}
