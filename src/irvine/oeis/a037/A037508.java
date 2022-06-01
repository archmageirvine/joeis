package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037508 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period 1,2,0.
 * @author Sean A. Irvine
 */
public class A037508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037508() {
    super(new long[] {-7, 1, 0, 7}, new long[] {1, 9, 63, 442});
  }
}
