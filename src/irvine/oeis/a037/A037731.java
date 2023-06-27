package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037731 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period 2,1,0,3.
 * @author Sean A. Irvine
 */
public class A037731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037731() {
    super(1, new long[] {-5, 1, 0, 0, 5}, new long[] {2, 11, 55, 278, 1392});
  }
}
