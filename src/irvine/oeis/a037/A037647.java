package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037647 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period 3,0,1.
 * @author Sean A. Irvine
 */
public class A037647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037647() {
    super(1, new long[] {-5, 1, 0, 5}, new long[] {3, 15, 76, 383});
  }
}
