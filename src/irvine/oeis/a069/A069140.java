package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069140 a(n) = (4n-1)*4n*(4n+1).
 * @author Sean A. Irvine
 */
public class A069140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069140() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 60, 504, 1716});
  }
}
