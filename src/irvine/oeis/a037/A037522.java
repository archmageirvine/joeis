package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037522 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period 2,1,0.
 * @author Sean A. Irvine
 */
public class A037522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037522() {
    super(new long[] {-5, 1, 0, 5}, new long[] {2, 11, 55, 277});
  }
}
