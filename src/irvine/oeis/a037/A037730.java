package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037730 Base 4 digits are, in order, the first n terms of the periodic sequence with initial period 2,1,0,3.
 * @author Sean A. Irvine
 */
public class A037730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037730() {
    super(1, new long[] {-4, 1, 0, 0, 4}, new long[] {2, 9, 36, 147, 590});
  }
}
