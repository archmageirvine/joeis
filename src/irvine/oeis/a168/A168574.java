package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168574 a(n) = (4*n + 3)*(1 + 2*n^2)/3.
 * @author Sean A. Irvine
 */
public class A168574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168574() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 7, 33, 95});
  }
}
