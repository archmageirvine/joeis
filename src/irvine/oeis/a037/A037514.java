package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037514 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period 2,0,1.
 * @author Sean A. Irvine
 */
public class A037514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037514() {
    super(new long[] {-5, 1, 0, 5}, new long[] {2, 10, 51, 257});
  }
}
