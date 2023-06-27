package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037561 Base 4 digits are, in order, the first n terms of the periodic sequence with initial period 2,2,1.
 * @author Sean A. Irvine
 */
public class A037561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037561() {
    super(1, new long[] {-4, 1, 0, 4}, new long[] {2, 10, 41, 166});
  }
}
