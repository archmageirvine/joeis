package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037539 Base 6 digits are, in order, the first n terms of the periodic sequence with initial period 1,2,1.
 * @author Sean A. Irvine
 */
public class A037539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037539() {
    super(new long[] {-6, 1, 0, 6}, new long[] {1, 8, 49, 295});
  }
}
