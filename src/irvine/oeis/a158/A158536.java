package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158536.
 * @author Sean A. Irvine
 */
public class A158536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158536() {
    super(new long[] {1, -3, 3}, new long[] {11, 132, 495});
  }
}
