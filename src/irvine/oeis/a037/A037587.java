package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037587 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 3,1.
 * @author Sean A. Irvine
 */
public class A037587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037587() {
    super(1, new long[] {-8, 1, 8}, new long[] {3, 25, 203});
  }
}
