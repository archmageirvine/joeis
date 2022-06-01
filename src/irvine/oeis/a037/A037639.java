package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037639 Base 4 digits are, in order, the first n terms of the periodic sequence with initial period 2,3,1.
 * @author Sean A. Irvine
 */
public class A037639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037639() {
    super(new long[] {-4, 1, 0, 4}, new long[] {2, 11, 45, 182});
  }
}
