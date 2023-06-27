package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037689 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period 1,2,0,3.
 * @author Sean A. Irvine
 */
public class A037689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037689() {
    super(1, new long[] {-5, 1, 0, 0, 5}, new long[] {1, 7, 35, 178, 891});
  }
}
