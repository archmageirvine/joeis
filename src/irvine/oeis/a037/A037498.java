package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037498 Base-5 digits are, in order, the first n terms of the periodic sequence with initial period 1,0,2.
 * @author Sean A. Irvine
 */
public class A037498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037498() {
    super(1, new long[] {-5, 1, 0, 5}, new long[] {1, 5, 27, 136});
  }
}
