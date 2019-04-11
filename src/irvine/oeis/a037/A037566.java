package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037566 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 2,2,1.
 * @author Sean A. Irvine
 */
public class A037566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037566() {
    super(new long[] {-9, 1, 0, 9}, new long[] {2, 20, 181, 1631});
  }
}
