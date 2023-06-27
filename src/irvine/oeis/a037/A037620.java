package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037620 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period 2,0,3.
 * @author Sean A. Irvine
 */
public class A037620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037620() {
    super(1, new long[] {-6, 1, 0, 6}, new long[] {2, 12, 75, 452});
  }
}
