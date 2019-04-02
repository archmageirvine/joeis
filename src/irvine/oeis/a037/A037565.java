package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037565 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 2,2,1.
 * @author Sean A. Irvine
 */
public class A037565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037565() {
    super(new long[] {-8, 1, 0, 8}, new long[] {2, 18, 145, 1162});
  }
}
