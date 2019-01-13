package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226141.
 * @author Sean A. Irvine
 */
public class A226141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226141() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 2, 5, 18, 30, 64, 91});
  }
}
