package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245581.
 * @author Sean A. Irvine
 */
public class A245581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245581() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 3, 2, 7});
  }
}
