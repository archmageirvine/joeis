package irvine.oeis.a026;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A026038 a(n) = (d(n)-r(n))/2, where d = A026037 and r is the periodic sequence with fundamental period (1,0,0,1).
 * @author Sean A. Irvine
 */
public class A026038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026038() {
    super(new long[] {-1, 4, -7, 8, -7, 4}, new long[] {5, 11, 20, 33, 52, 78});
  }
}
