package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075536.
 * @author Sean A. Irvine
 */
public class A075536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075536() {
    super(new long[] {1, 0, 1, 0, 3, 0}, new long[] {0, 1, 1, 7, 4, 21});
  }
}
