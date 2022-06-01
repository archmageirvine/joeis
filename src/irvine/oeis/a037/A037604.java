package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037604 Base-4 digits are, in order, the first n terms of the periodic sequence with initial period 1,2,3.
 * @author Sean A. Irvine
 */
public class A037604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037604() {
    super(new long[] {-4, 1, 0, 4}, new long[] {1, 6, 27, 109});
  }
}
