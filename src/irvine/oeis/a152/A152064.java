package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152064 a(n) = 2*n^3 - 3*n^2 + 5.
 * @author Sean A. Irvine
 */
public class A152064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152064() {
    super(new long[] {-1, 4, -6, 4}, new long[] {5, 4, 9, 32});
  }
}
