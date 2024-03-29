package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158536 a(n) = 121*n^2 + 11.
 * @author Sean A. Irvine
 */
public class A158536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158536() {
    super(new long[] {1, -3, 3}, new long[] {11, 132, 495});
  }
}
