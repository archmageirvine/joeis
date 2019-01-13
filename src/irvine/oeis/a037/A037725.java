package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037725.
 * @author Sean A. Irvine
 */
public class A037725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037725() {
    super(new long[] {-6, 1, 0, 0, 6}, new long[] {2, 12, 75, 451, 2708});
  }
}
