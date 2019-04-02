package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037574 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 2,1,2.
 * @author Sean A. Irvine
 */
public class A037574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037574() {
    super(new long[] {-9, 1, 0, 9}, new long[] {2, 19, 173, 1559});
  }
}
