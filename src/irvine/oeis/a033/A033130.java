package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033130 Base-3 digits are, in order, the first n terms of the periodic sequence with initial period 1,1,0.
 * @author Sean A. Irvine
 */
public class A033130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033130() {
    super(new long[] {-3, 1, 0, 3}, new long[] {1, 4, 12, 37});
  }
}
