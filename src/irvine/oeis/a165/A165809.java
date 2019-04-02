package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165809 a(n) = 3*n*(63*n-12+310*n^2).
 * @author Sean A. Irvine
 */
public class A165809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165809() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1083, 8124, 26703, 62400});
  }
}
