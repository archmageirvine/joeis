package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037713 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 1,3,2,0.
 * @author Sean A. Irvine
 */
public class A037713 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037713() {
    super(new long[] {-8, 9, -9, 9}, new long[] {1, 11, 90, 720});
  }
}
