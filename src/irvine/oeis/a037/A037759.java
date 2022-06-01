package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037759 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period 3,0,1,2.
 * @author Sean A. Irvine
 */
public class A037759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037759() {
    super(new long[] {-5, 1, 0, 0, 5}, new long[] {3, 15, 76, 382, 1913});
  }
}
