package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037674 Base-4 digits are, in order, the first n terms of the periodic sequence with initial period 1,0,2,3.
 * @author Sean A. Irvine
 */
public class A037674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037674() {
    super(new long[] {-4, 5, -5, 5}, new long[] {1, 4, 18, 75});
  }
}
