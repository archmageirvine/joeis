package irvine.oeis.a172;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A172397 a(n) = a(n-1) + a(n-2) - a(n-3) - a(n-8), starting 1,1,2,2,3,3,4,4.
 * @author Sean A. Irvine
 */
public class A172397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172397() {
    super(new long[] {-1, 0, 0, 0, 0, -1, 1, 1}, new long[] {1, 1, 2, 2, 3, 3, 4, 4});
  }
}
