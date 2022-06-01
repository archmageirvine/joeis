package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037570 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period 2,1,2.
 * @author Sean A. Irvine
 */
public class A037570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037570() {
    super(new long[] {-5, 1, 0, 5}, new long[] {2, 11, 57, 287});
  }
}
