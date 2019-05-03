package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026061 <code>a(n) = (d(n)-r(n))/2</code>, where d <code>= A026060</code> and r is the periodic sequence with fundamental period <code>(1,0,0,0)</code>.
 * @author Sean A. Irvine
 */
public class A026061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026061() {
    super(new long[] {-1, 3, -3, 1, 1, -3, 3}, new long[] {22, 40, 63, 92, 127, 170, 220});
  }
}
