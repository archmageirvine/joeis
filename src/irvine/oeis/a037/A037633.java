package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037633 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period 2,1,3.
 * @author Sean A. Irvine
 */
public class A037633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037633() {
    super(1, new long[] {-5, 1, 0, 5}, new long[] {2, 11, 58, 292});
  }
}
