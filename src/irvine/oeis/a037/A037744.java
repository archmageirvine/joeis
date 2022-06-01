package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037744 Base 4 digits are, in order, the first n terms of the periodic sequence with initial period 2,3,0,1.
 * @author Sean A. Irvine
 */
public class A037744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037744() {
    super(new long[] {-4, 1, 0, 0, 4}, new long[] {2, 11, 44, 177, 710});
  }
}
