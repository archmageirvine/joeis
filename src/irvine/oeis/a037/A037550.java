package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037550 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 1,2,2.
 * @author Sean A. Irvine
 */
public class A037550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037550() {
    super(new long[] {-9, 1, 0, 9}, new long[] {1, 11, 101, 910});
  }
}
