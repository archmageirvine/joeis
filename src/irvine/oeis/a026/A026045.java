package irvine.oeis.a026;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A026045 a(n) = (d(n)-r(n))/5, where d = A026043 and r is the periodic sequence with fundamental period (0,2,3,0,0).
 * @author Sean A. Irvine
 */
public class A026045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026045() {
    super(new long[] {-1, 3, -3, 1, 0, 1, -3, 3}, new long[] {9, 13, 19, 28, 39, 53, 70, 91});
  }
}
