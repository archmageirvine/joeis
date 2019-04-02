package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037784 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 3,1,2,0.
 * @author Sean A. Irvine
 */
public class A037784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037784() {
    super(new long[] {-9, 1, 0, 0, 9}, new long[] {3, 28, 254, 2286, 20577});
  }
}
