package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037752 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period 2,3,1,0.
 * @author Sean A. Irvine
 */
public class A037752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037752() {
    super(new long[] {-5, 6, -6, 6}, new long[] {2, 13, 66, 330});
  }
}
