package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037706 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 1,3,0,2.
 * @author Sean A. Irvine
 */
public class A037706 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037706() {
    super(1, new long[] {-8, 1, 0, 0, 8}, new long[] {1, 11, 88, 706, 5649});
  }
}
