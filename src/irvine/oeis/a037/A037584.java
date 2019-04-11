package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037584 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period <code>3,1</code>.
 * @author Sean A. Irvine
 */
public class A037584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037584() {
    super(new long[] {-5, 1, 5}, new long[] {3, 16, 83});
  }
}
