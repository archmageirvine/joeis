package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163323 The 4th Hermite Polynomial evaluated at n: H_4(n) <code>= 16n^4 - 48n^2 + 12</code>.
 * @author Sean A. Irvine
 */
public class A163323 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163323() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {12, -20, 76, 876, 3340});
  }
}
