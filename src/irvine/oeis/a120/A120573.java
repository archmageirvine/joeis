package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120573 a(n) = n^5 + 3n^3 + 2n = n(n^2+1)(n^2+2).
 * @author Sean A. Irvine
 */
public class A120573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120573() {
    super(1, new long[] {-1, 6, -15, 20, -15, 6}, new long[] {6, 60, 330, 1224, 3510, 8436});
  }
}
