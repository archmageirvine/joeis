package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037676 Base-6 digits are, in order, the first n terms of the periodic sequence with initial period 1,0,2,3.
 * @author Sean A. Irvine
 */
public class A037676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037676() {
    super(1, new long[] {-6, 7, -7, 7}, new long[] {1, 6, 38, 231});
  }
}
