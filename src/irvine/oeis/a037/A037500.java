package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037500 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period 1,0,2.
 * @author Sean A. Irvine
 */
public class A037500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037500() {
    super(new long[] {-7, 1, 0, 7}, new long[] {1, 7, 51, 358});
  }
}
