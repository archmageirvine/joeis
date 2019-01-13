package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213035.
 * @author Sean A. Irvine
 */
public class A213035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213035() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {0, 1, 4, 8, 15, 24, 32});
  }
}
