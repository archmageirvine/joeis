package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037578 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period 1,3.
 * @author Sean A. Irvine
 */
public class A037578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037578() {
    super(new long[] {-6, 1, 6}, new long[] {1, 9, 55});
  }
}
