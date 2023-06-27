package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037643 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 2,3,1.
 * @author Sean A. Irvine
 */
public class A037643 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037643() {
    super(1, new long[] {-8, 1, 0, 8}, new long[] {2, 19, 153, 1226});
  }
}
