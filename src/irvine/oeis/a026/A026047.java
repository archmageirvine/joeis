package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026047 <code>a(n) = (d(n)-r(n))/2</code>, where d <code>= A026046</code> and r is the periodic sequence with fundamental period <code>(0,1,0,1)</code>.
 * @author Sean A. Irvine
 */
public class A026047 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026047() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {38, 52, 72, 97, 130});
  }
}
