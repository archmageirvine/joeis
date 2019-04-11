package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214630 <code>a(n)</code> is the reduced numerator of <code>1/4 -</code> 1/A109043(n)^2 <code>= (1 -</code> 1/A026741(n)^2)/4.
 * @author Sean A. Irvine
 */
public class A214630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214630() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {-1, 0, 0, 2, 3, 6, 2, 12, 15, 20, 6, 30});
  }
}
