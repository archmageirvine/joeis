package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026062 <code>a(n) = (d(n)-r(n))/5</code>, where d = A026060 and r is the periodic sequence with fundamental period <code>(0,0,1,4,0)</code>.
 * @author Sean A. Irvine
 */
public class A026062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026062() {
    super(new long[] {-1, 3, -3, 1, 0, 1, -3, 3}, new long[] {9, 16, 25, 36, 51, 68, 88, 111});
  }
}
