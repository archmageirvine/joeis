package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037635 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period 2,1,3.
 * @author Sean A. Irvine
 */
public class A037635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037635() {
    super(1, new long[] {-7, 1, 0, 7}, new long[] {2, 15, 108, 758});
  }
}
