package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037571 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period 2,1,2.
 * @author Sean A. Irvine
 */
public class A037571 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037571() {
    super(new long[] {-6, 1, 0, 6}, new long[] {2, 13, 80, 482});
  }
}
