package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164845 a(n) = (6 + 10*n + 5*n^2 + n^3)/2.
 * @author Sean A. Irvine
 */
public class A164845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164845() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 11, 27, 54});
  }
}
