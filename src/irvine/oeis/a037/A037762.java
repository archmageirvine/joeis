package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037762 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 3,0,1,2.
 * @author Sean A. Irvine
 */
public class A037762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037762() {
    super(new long[] {-8, 1, 0, 0, 8}, new long[] {3, 24, 193, 1546, 12371});
  }
}
