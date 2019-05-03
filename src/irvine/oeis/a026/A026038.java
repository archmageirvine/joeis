package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026038 <code>a(n) = (d(n)-r(n))/2</code>, where d <code>= A026037</code> and r is the periodic sequence with fundamental period <code>(1,0,0,1)</code>.
 * @author Sean A. Irvine
 */
public class A026038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026038() {
    super(new long[] {-1, 4, -7, 8, -7, 4}, new long[] {5, 11, 20, 33, 52, 78});
  }
}
