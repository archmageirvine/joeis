package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037490 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period 2,1.
 * @author Sean A. Irvine
 */
public class A037490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037490() {
    super(1, new long[] {-5, 1, 5}, new long[] {2, 11, 57});
  }
}
