package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033134 Base-7 digits are, in order, the first n terms of the periodic sequence with initial period 1,1,0.
 * @author Sean A. Irvine
 */
public class A033134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033134() {
    super(1, new long[] {-7, 1, 0, 7}, new long[] {1, 8, 56, 393});
  }
}
