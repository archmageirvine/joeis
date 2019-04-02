package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037560 Base 3 digits are, in order, the first n terms of the periodic sequence with initial period 2,2,1.
 * @author Sean A. Irvine
 */
public class A037560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037560() {
    super(new long[] {-3, 1, 0, 3}, new long[] {2, 8, 25, 77});
  }
}
