package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033131 Base-4 digits are, in order, the first n terms of the periodic sequence with initial period 1,1,0.
 * @author Sean A. Irvine
 */
public class A033131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033131() {
    super(1, new long[] {-4, 1, 0, 4}, new long[] {1, 5, 20, 81});
  }
}
