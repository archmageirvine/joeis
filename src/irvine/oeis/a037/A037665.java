package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037665 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period <code>3,1,0</code>.
 * @author Sean A. Irvine
 */
public class A037665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037665() {
    super(new long[] {-9, 1, 0, 9}, new long[] {3, 28, 252, 2271});
  }
}
