package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026058 <code>a(n) = (d(n)-r(n))/2</code>, where d = A026057 and r is the periodic sequence with fundamental period <code>(0,0,1,0)</code>.
 * @author Sean A. Irvine
 */
public class A026058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026058() {
    super(new long[] {-1, 3, -3, 1, 1, -3, 3}, new long[] {13, 25, 41, 63, 90, 123, 162});
  }
}
