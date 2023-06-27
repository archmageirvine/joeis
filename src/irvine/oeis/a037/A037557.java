package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037557 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 2,1,1.
 * @author Sean A. Irvine
 */
public class A037557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037557() {
    super(1, new long[] {-8, 1, 0, 8}, new long[] {2, 17, 137, 1098});
  }
}
