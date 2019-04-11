package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037795 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period 3,2,1,0.
 * @author Sean A. Irvine
 */
public class A037795 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037795() {
    super(new long[] {-6, 1, 0, 0, 6}, new long[] {3, 20, 121, 726, 4359});
  }
}
