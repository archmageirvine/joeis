package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037773 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period 3,1,0,2.
 * @author Sean A. Irvine
 */
public class A037773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037773() {
    super(1, new long[] {-5, 6, -6, 6}, new long[] {3, 16, 80, 402});
  }
}
