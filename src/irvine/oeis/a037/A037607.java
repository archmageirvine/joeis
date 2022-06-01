package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037607 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period 1,2,3.
 * @author Sean A. Irvine
 */
public class A037607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037607() {
    super(new long[] {-7, 1, 0, 7}, new long[] {1, 9, 66, 463});
  }
}
