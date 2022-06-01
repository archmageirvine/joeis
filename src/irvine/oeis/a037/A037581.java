package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037581 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 1,3.
 * @author Sean A. Irvine
 */
public class A037581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037581() {
    super(new long[] {-9, 1, 9}, new long[] {1, 12, 109});
  }
}
