package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037609 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 1,2,3.
 * @author Sean A. Irvine
 */
public class A037609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037609() {
    super(new long[] {-9, 1, 0, 9}, new long[] {1, 11, 102, 919});
  }
}
