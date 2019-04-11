package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037677 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period 1,0,2,3.
 * @author Sean A. Irvine
 */
public class A037677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037677() {
    super(new long[] {-7, 8, -8, 8}, new long[] {1, 7, 51, 360});
  }
}
