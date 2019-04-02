package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037600 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period 1,3,0.
 * @author Sean A. Irvine
 */
public class A037600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037600() {
    super(new long[] {-7, 1, 0, 7}, new long[] {1, 10, 70, 491});
  }
}
