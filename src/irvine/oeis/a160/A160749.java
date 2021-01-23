package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160749 a(n) = (11*n^2 + 19*n + 10)/2.
 * @author Sean A. Irvine
 */
public class A160749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160749() {
    super(new long[] {1, -3, 3}, new long[] {5, 20, 46});
  }
}
