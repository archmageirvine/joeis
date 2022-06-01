package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033145 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 1,0,0.
 * @author Sean A. Irvine
 */
public class A033145 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033145() {
    super(new long[] {-9, 1, 0, 9}, new long[] {1, 9, 81, 730});
  }
}
