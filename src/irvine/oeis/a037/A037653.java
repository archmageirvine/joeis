package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037653 Base 4 digits are, in order, the first n terms of the periodic sequence with initial period 3,0,2.
 * @author Sean A. Irvine
 */
public class A037653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037653() {
    super(1, new long[] {-4, 1, 0, 4}, new long[] {3, 12, 50, 203});
  }
}
