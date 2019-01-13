package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213036.
 * @author Sean A. Irvine
 */
public class A213036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213036() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {0, 1, 3, 5, 12, 16, 20});
  }
}
