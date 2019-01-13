package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107402.
 * @author Sean A. Irvine
 */
public class A107402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107402() {
    super(new long[] {-1, -1, 5, 5, -1}, new long[] {0, 1, 1, 2, 3});
  }
}
