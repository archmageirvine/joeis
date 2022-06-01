package irvine.oeis.a169;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A169830 Numbers n such that 2*reverse(n) - n = 1.
 * @author Sean A. Irvine
 */
public class A169830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169830() {
    super(new long[] {-10, 11}, new long[] {1, 73});
  }
}
