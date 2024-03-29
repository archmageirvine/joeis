package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037562 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period 2,2,1.
 * @author Sean A. Irvine
 */
public class A037562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037562() {
    super(1, new long[] {-5, 1, 0, 5}, new long[] {2, 12, 61, 307});
  }
}
