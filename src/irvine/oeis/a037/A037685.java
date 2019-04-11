package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037685 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,0,3,2</code>.
 * @author Sean A. Irvine
 */
public class A037685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037685() {
    super(new long[] {-8, 1, 0, 0, 8}, new long[] {1, 8, 67, 538, 4305});
  }
}
