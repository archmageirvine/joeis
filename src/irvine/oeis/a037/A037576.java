package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037576 Base-4 digits are, in order, the first n terms of the periodic sequence with initial period 1,3.
 * @author Sean A. Irvine
 */
public class A037576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037576() {
    super(1, new long[] {-4, 1, 4}, new long[] {1, 7, 29});
  }
}
