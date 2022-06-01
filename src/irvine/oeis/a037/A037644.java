package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037644 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 2,3,1.
 * @author Sean A. Irvine
 */
public class A037644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037644() {
    super(new long[] {-9, 1, 0, 9}, new long[] {2, 21, 190, 1712});
  }
}
