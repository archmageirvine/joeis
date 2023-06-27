package irvine.oeis.a026;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A026061 a(n) = (d(n)-r(n))/2, where d = A026060 and r is the periodic sequence with fundamental period (1,0,0,0).
 * @author Sean A. Irvine
 */
public class A026061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026061() {
    super(5, new long[] {-1, 3, -3, 1, 1, -3, 3}, new long[] {22, 40, 63, 92, 127, 170, 220});
  }
}
