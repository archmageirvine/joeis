package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037646 Base 4 digits are, in order, the first n terms of the periodic sequence with initial period 3,0,1.
 * @author Sean A. Irvine
 */
public class A037646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037646() {
    super(1, new long[] {-4, 1, 0, 4}, new long[] {3, 12, 49, 199});
  }
}
