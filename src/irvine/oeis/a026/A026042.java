package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026042 <code>a(n) = (d(n)-r(n))/5</code>, where d <code>= A026040</code> and r is the periodic sequence with fundamental period <code>(4,0,4,3,4)</code>.
 * @author Sean A. Irvine
 */
public class A026042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026042() {
    super(new long[] {-1, 3, -3, 1, 0, 1, -3, 3}, new long[] {4, 8, 12, 19, 28, 40, 56, 74});
  }
}
