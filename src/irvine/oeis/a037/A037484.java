package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037484 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period 1,2.
 * @author Sean A. Irvine
 */
public class A037484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037484() {
    super(1, new long[] {-7, 1, 7}, new long[] {1, 9, 64});
  }
}
