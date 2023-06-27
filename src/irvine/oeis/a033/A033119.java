package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033119 Base-9 digits are, in order, the first n terms of the periodic sequence with initial period 1,0.
 * @author Sean A. Irvine
 */
public class A033119 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033119() {
    super(1, new long[] {-9, 1, 9}, new long[] {1, 9, 82});
  }
}
