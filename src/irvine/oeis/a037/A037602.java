package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037602 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 1,3,0.
 * @author Sean A. Irvine
 */
public class A037602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037602() {
    super(new long[] {-9, 1, 0, 9}, new long[] {1, 12, 108, 973});
  }
}
