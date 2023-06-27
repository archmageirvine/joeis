package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037710 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period 1,3,2,0.
 * @author Sean A. Irvine
 */
public class A037710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037710() {
    super(1, new long[] {-5, 6, -6, 6}, new long[] {1, 8, 42, 210});
  }
}
