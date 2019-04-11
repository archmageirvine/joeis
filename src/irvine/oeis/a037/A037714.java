package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037714 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 1,3,2,0.
 * @author Sean A. Irvine
 */
public class A037714 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037714() {
    super(new long[] {-9, 10, -10, 10}, new long[] {1, 12, 110, 990});
  }
}
