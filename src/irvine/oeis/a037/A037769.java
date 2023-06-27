package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037769 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 3,0,2,1.
 * @author Sean A. Irvine
 */
public class A037769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037769() {
    super(1, new long[] {-8, 1, 0, 0, 8}, new long[] {3, 24, 194, 1553, 12427});
  }
}
