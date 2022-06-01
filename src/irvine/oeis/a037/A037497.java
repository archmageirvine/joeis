package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037497 Base-4 digits are, in order, the first n terms of the periodic sequence with initial period 1,0,2.
 * @author Sean A. Irvine
 */
public class A037497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037497() {
    super(new long[] {-4, 1, 0, 4}, new long[] {1, 4, 18, 73});
  }
}
