package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214630 a(n) is the reduced numerator of 1/4 - 1/A109043(n)^2 = (1 - 1/A026741(n)^2)/4.
 * @author Sean A. Irvine
 */
public class A214630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214630() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {-1, 0, 0, 2, 3, 6, 2, 12, 15, 20, 6, 30});
  }
}
