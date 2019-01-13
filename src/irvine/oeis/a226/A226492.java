package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226492.
 * @author Sean A. Irvine
 */
public class A226492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226492() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 17});
  }
}
