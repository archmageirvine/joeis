package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033125 Base-7 digits are, in order, the first n terms of the periodic sequence with initial period 1,0,1.
 * @author Sean A. Irvine
 */
public class A033125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033125() {
    super(new long[] {-7, 1, 0, 7}, new long[] {1, 7, 50, 351});
  }
}
