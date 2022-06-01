package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037555 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period 2,1,1.
 * @author Sean A. Irvine
 */
public class A037555 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037555() {
    super(new long[] {-6, 1, 0, 6}, new long[] {2, 13, 79, 476});
  }
}
