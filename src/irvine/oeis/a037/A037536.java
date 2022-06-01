package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037536 Base-3 digits are, in order, the first n terms of the periodic sequence with initial period 1,2,1.
 * @author Sean A. Irvine
 */
public class A037536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037536() {
    super(new long[] {-3, 1, 0, 3}, new long[] {1, 5, 16, 49});
  }
}
