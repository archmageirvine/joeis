package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026056 <code>a(n) =</code> (d(n)-r(n))/5, where d = A026054 and r is the periodic sequence with fundamental period <code>(3,3,0,0,4)</code>.
 * @author Sean A. Irvine
 */
public class A026056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026056() {
    super(new long[] {-1, 3, -3, 1, 0, 1, -3, 3}, new long[] {2, 5, 10, 16, 23, 33, 45, 60});
  }
}
