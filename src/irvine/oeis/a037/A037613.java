package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037613 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,3,2</code>.
 * @author Sean A. Irvine
 */
public class A037613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037613() {
    super(new long[] {-6, 1, 0, 6}, new long[] {1, 9, 56, 337});
  }
}
