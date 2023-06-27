package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033132 Base-5 digits are, in order, the first n terms of the periodic sequence with initial period 1,1,0.
 * @author Sean A. Irvine
 */
public class A033132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033132() {
    super(1, new long[] {-5, 1, 0, 5}, new long[] {1, 6, 30, 151});
  }
}
