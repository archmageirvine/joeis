package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037494 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 2,1.
 * @author Sean A. Irvine
 */
public class A037494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037494() {
    super(new long[] {-9, 1, 9}, new long[] {2, 19, 173});
  }
}
