package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033113 Base-3 digits are, in order, the first n terms of the periodic sequence with initial period 1,0.
 * @author Sean A. Irvine
 */
public class A033113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033113() {
    super(new long[] {-3, 1, 3}, new long[] {1, 3, 10});
  }
}
