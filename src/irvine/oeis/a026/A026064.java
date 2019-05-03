package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026064 <code>a(n) = (d(n)-r(n))/2</code>, where d <code>= A026063</code> and r is the periodic sequence with fundamental period <code>(1,1,0,1)</code>.
 * @author Sean A. Irvine
 */
public class A026064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026064() {
    super(new long[] {-1, 3, -3, 1, 1, -3, 3}, new long[] {35, 59, 90, 127, 172, 225, 287});
  }
}
