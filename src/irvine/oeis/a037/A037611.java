package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037611 Base 4 digits are, in order, the first n terms of the periodic sequence with initial period 1,3,2.
 * @author Sean A. Irvine
 */
public class A037611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037611() {
    super(1, new long[] {-4, 1, 0, 4}, new long[] {1, 7, 30, 121});
  }
}
