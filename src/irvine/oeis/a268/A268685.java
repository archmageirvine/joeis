package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268685 a(n) = 3*(n + 1)*(n + 2)*(3*n + 1)*(3*n + 4)/4.
 * @author Sean A. Irvine
 */
public class A268685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268685() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {6, 126, 630, 1950, 4680});
  }
}
