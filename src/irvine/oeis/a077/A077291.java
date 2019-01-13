package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077291.
 * @author Sean A. Irvine
 */
public class A077291 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077291() {
    super(new long[] {1, -1, -10, 10, 1}, new long[] {0, 3, 8, 35, 84});
  }
}
