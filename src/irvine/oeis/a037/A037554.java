package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037554 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period 2,1,1.
 * @author Sean A. Irvine
 */
public class A037554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037554() {
    super(new long[] {-5, 1, 0, 5}, new long[] {2, 11, 56, 282});
  }
}
