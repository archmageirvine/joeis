package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158672 a(n) = 900*n^2 + 30.
 * @author Sean A. Irvine
 */
public class A158672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158672() {
    super(new long[] {1, -3, 3}, new long[] {30, 930, 3630});
  }
}
