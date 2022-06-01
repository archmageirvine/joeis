package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037625 Base 4 digits are, in order, the first n terms of the periodic sequence with initial period 2,3,0.
 * @author Sean A. Irvine
 */
public class A037625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037625() {
    super(new long[] {-4, 1, 0, 4}, new long[] {2, 11, 44, 178});
  }
}
