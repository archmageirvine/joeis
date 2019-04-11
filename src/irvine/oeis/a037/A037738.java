package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037738 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period 2,1,3,0.
 * @author Sean A. Irvine
 */
public class A037738 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037738() {
    super(new long[] {-5, 1, 0, 0, 5}, new long[] {2, 11, 58, 290, 1452});
  }
}
