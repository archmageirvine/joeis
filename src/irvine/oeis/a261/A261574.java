package irvine.oeis.a261;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A261574 a(n) = n*(n^2 + 3)*(n^6 + 6*n^4 + 9*n^2 + 3).
 * @author Sean A. Irvine
 */
public class A261574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261574() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 76, 2786, 46764, 439204, 2744420, 12813606, 48229636, 153992264, 432083484});
  }
}
