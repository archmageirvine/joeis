package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084857 Inverse binomial transform of n^2*3^(n-1).
 * @author Sean A. Irvine
 */
public class A084857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084857() {
    super(new long[] {8, -12, 6}, new long[] {0, 1, 10});
  }
}
