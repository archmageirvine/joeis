package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037572.
 * @author Sean A. Irvine
 */
public class A037572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037572() {
    super(new long[] {-7, 1, 0, 7}, new long[] {2, 15, 107, 751});
  }
}
