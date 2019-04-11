package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037672 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 3,2,0.
 * @author Sean A. Irvine
 */
public class A037672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037672() {
    super(new long[] {-9, 1, 0, 9}, new long[] {3, 29, 261, 2352});
  }
}
