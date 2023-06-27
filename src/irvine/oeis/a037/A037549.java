package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037549 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 1,2,2.
 * @author Sean A. Irvine
 */
public class A037549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037549() {
    super(1, new long[] {-8, 1, 0, 8}, new long[] {1, 10, 82, 657});
  }
}
