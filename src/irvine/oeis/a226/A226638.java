package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226638.
 * @author Sean A. Irvine
 */
public class A226638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226638() {
    super(new long[] {-1, 2, 7, 2}, new long[] {0, 1, 6, 20});
  }
}
