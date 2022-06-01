package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037651 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 3,0,1.
 * @author Sean A. Irvine
 */
public class A037651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037651() {
    super(new long[] {-9, 1, 0, 9}, new long[] {3, 27, 244, 2199});
  }
}
