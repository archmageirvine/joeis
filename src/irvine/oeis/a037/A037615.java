package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037615 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 1,3,2.
 * @author Sean A. Irvine
 */
public class A037615 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037615() {
    super(new long[] {-8, 1, 0, 8}, new long[] {1, 11, 90, 721});
  }
}
