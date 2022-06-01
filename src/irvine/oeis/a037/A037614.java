package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037614 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period 1,3,2.
 * @author Sean A. Irvine
 */
public class A037614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037614() {
    super(new long[] {-7, 1, 0, 7}, new long[] {1, 10, 72, 505});
  }
}
