package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270869 a(n) = n^5 + 4*n^4 + 13*n^3 + 23*n^2 + 25*n + 3.
 * @author Sean A. Irvine
 */
public class A270869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270869() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {3, 69, 345, 1203, 3351, 7953});
  }
}
