package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037634 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period 2,1,3.
 * @author Sean A. Irvine
 */
public class A037634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037634() {
    super(1, new long[] {-6, 1, 0, 6}, new long[] {2, 13, 81, 488});
  }
}
