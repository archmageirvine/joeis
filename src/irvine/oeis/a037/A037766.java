package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037766 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period 3,0,2,1.
 * @author Sean A. Irvine
 */
public class A037766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037766() {
    super(new long[] {-5, 1, 0, 0, 5}, new long[] {3, 15, 77, 386, 1933});
  }
}
