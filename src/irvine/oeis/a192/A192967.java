package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192967.
 * @author Sean A. Irvine
 */
public class A192967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192967() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 0, 2, 4});
  }
}
