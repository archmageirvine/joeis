package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037590 Base-4 digits are, in order, the first n terms of the periodic sequence with initial period 1,0,3.
 * @author Sean A. Irvine
 */
public class A037590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037590() {
    super(1, new long[] {-4, 1, 0, 4}, new long[] {1, 4, 19, 77});
  }
}
