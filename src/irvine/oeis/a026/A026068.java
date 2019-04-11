package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026068 (d(n)-r(n))/5, where d = A026066 and r is the periodic sequence with fundamental period <code>(0,3,1,0,1)</code>.
 * @author Sean A. Irvine
 */
public class A026068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026068() {
    super(new long[] {-1, 3, -3, 1, 0, 1, -3, 3}, new long[] {21, 33, 49, 68, 90, 116, 145, 179});
  }
}
