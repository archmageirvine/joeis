package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037520 Base 3 digits are, in order, the first n terms of the periodic sequence with initial period 2,1,0.
 * @author Sean A. Irvine
 */
public class A037520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037520() {
    super(new long[] {-3, 1, 0, 3}, new long[] {2, 7, 21, 65});
  }
}
