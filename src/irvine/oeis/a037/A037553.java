package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037553 Base 4 digits are, in order, the first n terms of the periodic sequence with initial period 2,1,1.
 * @author Sean A. Irvine
 */
public class A037553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037553() {
    super(new long[] {-4, 1, 0, 4}, new long[] {2, 9, 37, 150});
  }
}
