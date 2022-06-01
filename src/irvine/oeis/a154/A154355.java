package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154355 a(n) = 25*n^2 - 36*n + 13.
 * @author Sean A. Irvine
 */
public class A154355 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154355() {
    super(new long[] {1, -3, 3}, new long[] {13, 2, 41});
  }
}
