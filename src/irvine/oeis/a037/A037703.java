package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037703 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period 1,3,0,2.
 * @author Sean A. Irvine
 */
public class A037703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037703() {
    super(1, new long[] {-5, 1, 0, 0, 5}, new long[] {1, 8, 40, 202, 1011});
  }
}
