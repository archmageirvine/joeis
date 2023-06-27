package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037669 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period 3,2,0.
 * @author Sean A. Irvine
 */
public class A037669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037669() {
    super(1, new long[] {-6, 1, 0, 6}, new long[] {3, 20, 120, 723});
  }
}
