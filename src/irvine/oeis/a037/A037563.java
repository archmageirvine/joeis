package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037563 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period 2,2,1.
 * @author Sean A. Irvine
 */
public class A037563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037563() {
    super(1, new long[] {-6, 1, 0, 6}, new long[] {2, 14, 85, 512});
  }
}
