package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226311.
 * @author Sean A. Irvine
 */
public class A226311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226311() {
    super(new long[] {2, 1, 1, 1, 1}, new long[] {2, 1, 5, 10, 20});
  }
}
