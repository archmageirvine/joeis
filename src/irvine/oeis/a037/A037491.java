package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037491 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period 2,1.
 * @author Sean A. Irvine
 */
public class A037491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037491() {
    super(1, new long[] {-6, 1, 6}, new long[] {2, 13, 80});
  }
}
