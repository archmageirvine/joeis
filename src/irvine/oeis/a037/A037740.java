package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037740.
 * @author Sean A. Irvine
 */
public class A037740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037740() {
    super(new long[] {-7, 1, 0, 0, 7}, new long[] {2, 15, 108, 756, 5294});
  }
}
