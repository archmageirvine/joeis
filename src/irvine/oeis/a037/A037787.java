package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037787 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period 3,2,0,1.
 * @author Sean A. Irvine
 */
public class A037787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037787() {
    super(new long[] {-5, 6, -6, 6}, new long[] {3, 17, 85, 426});
  }
}
