package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037545 Base-4 digits are, in order, the first n terms of the periodic sequence with initial period 1,2,2.
 * @author Sean A. Irvine
 */
public class A037545 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037545() {
    super(new long[] {-4, 1, 0, 4}, new long[] {1, 6, 26, 105});
  }
}
