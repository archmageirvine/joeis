package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037533 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 1,1,2.
 * @author Sean A. Irvine
 */
public class A037533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037533() {
    super(1, new long[] {-8, 1, 0, 8}, new long[] {1, 9, 74, 593});
  }
}
