package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026064 a(n) = (d(n)-r(n))/2, where d = A026063 and r is the periodic sequence with fundamental period (1,1,0,1).
 * @author Sean A. Irvine
 */
public class A026064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026064() {
    super(new long[] {-1, 3, -3, 1, 1, -3, 3}, new long[] {35, 59, 90, 127, 172, 225, 287});
  }
}
