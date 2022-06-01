package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037518 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 2,0,1.
 * @author Sean A. Irvine
 */
public class A037518 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037518() {
    super(new long[] {-9, 1, 0, 9}, new long[] {2, 18, 163, 1469});
  }
}
