package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037593 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period 1,0,3.
 * @author Sean A. Irvine
 */
public class A037593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037593() {
    super(new long[] {-7, 1, 0, 7}, new long[] {1, 7, 52, 365});
  }
}
