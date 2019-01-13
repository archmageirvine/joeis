package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077988.
 * @author Sean A. Irvine
 */
public class A077988 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077988() {
    super(new long[] {2, 0, -2}, new long[] {1, -2, 4});
  }
}
