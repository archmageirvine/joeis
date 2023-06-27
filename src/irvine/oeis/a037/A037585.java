package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037585 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period 3,1.
 * @author Sean A. Irvine
 */
public class A037585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037585() {
    super(1, new long[] {-6, 1, 6}, new long[] {3, 19, 117});
  }
}
