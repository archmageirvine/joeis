package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037594 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 1,0,3.
 * @author Sean A. Irvine
 */
public class A037594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037594() {
    super(new long[] {-8, 1, 0, 8}, new long[] {1, 8, 67, 537});
  }
}
