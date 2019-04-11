package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037765 Base 4 digits are, in order, the first n terms of the periodic sequence with initial period 3,0,2,1.
 * @author Sean A. Irvine
 */
public class A037765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037765() {
    super(new long[] {-4, 1, 0, 0, 4}, new long[] {3, 12, 50, 201, 807});
  }
}
