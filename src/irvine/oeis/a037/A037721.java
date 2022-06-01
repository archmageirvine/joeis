package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037721 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 2,0,1,3.
 * @author Sean A. Irvine
 */
public class A037721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037721() {
    super(new long[] {-9, 10, -10, 10}, new long[] {2, 18, 163, 1470});
  }
}
