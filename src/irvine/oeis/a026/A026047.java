package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026047 a(n) = (d(n)-r(n))/2, where d = A026046 and r is the periodic sequence with fundamental period (0,1,0,1).
 * @author Sean A. Irvine
 */
public class A026047 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026047() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {38, 52, 72, 97, 130});
  }
}
