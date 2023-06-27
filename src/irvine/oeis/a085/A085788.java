package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085788 Partial sums of n 3-spaced triangular numbers beginning with t(3), e.g., a(2)=t(3)+t(6)=6+21=27.
 * @author Sean A. Irvine
 */
public class A085788 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085788() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {6, 27, 72, 150});
  }
}
