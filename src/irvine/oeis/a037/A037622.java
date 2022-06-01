package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037622 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 2,0,3.
 * @author Sean A. Irvine
 */
public class A037622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037622() {
    super(new long[] {-8, 1, 0, 8}, new long[] {2, 16, 131, 1050});
  }
}
