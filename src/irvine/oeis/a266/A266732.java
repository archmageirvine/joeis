package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266732 a(n) = 10*binomial(n+4, 5).
 * @author Sean A. Irvine
 */
public class A266732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266732() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 10, 60, 210, 560, 1260});
  }
}
