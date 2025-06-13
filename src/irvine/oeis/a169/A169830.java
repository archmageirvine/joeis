package irvine.oeis.a169;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A169830 Numbers k such that 2*reverse(k) - k = 1.
 * @author Sean A. Irvine
 */
public class A169830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169830() {
    super(1, new long[] {-10, 11}, new long[] {1, 73});
  }
}
