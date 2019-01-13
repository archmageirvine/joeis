package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037796.
 * @author Sean A. Irvine
 */
public class A037796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037796() {
    super(new long[] {-7, 1, 0, 0, 7}, new long[] {3, 23, 162, 1134, 7941});
  }
}
