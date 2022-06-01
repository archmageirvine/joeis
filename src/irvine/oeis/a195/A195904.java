package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195904 Base-2 digits are, in order, the first n terms of the periodic sequence with initial period 1,0,0,0,0,0.
 * @author Sean A. Irvine
 */
public class A195904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195904() {
    super(new long[] {-2, 1, 0, 0, 0, 0, 2}, new long[] {1, 2, 4, 8, 16, 32, 65});
  }
}
