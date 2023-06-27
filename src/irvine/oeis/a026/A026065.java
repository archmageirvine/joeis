package irvine.oeis.a026;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A026065 a(n) = (d(n)-r(n))/5, where d = A026063 and r is the periodic sequence with fundamental period (1,4,0,0,0).
 * @author Sean A. Irvine
 */
public class A026065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026065() {
    super(6, new long[] {-1, 3, -3, 1, 0, 1, -3, 3}, new long[] {14, 23, 36, 51, 69, 90, 114, 143});
  }
}
