package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257595.
 * @author Sean A. Irvine
 */
public class A257595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257595() {
    super(new long[] {1, 3, 3, -2, -6, -3, 3, 3, 0}, new long[] {0, 0, 0, 1, 1, 5, 9, 18, 34});
  }
}
