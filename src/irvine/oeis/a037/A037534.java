package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037534 Base 9 digits are, in order, the first n terms of the periodic sequence with initial period 1,1,2.
 * @author Sean A. Irvine
 */
public class A037534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037534() {
    super(1, new long[] {-9, 1, 0, 9}, new long[] {1, 10, 92, 829});
  }
}
