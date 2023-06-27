package irvine.oeis.a173;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A173078 a(n) = (5*2^n - 2*(-1)^n - 9)/3.
 * @author Sean A. Irvine
 */
public class A173078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173078() {
    super(1, new long[] {-2, 1, 2}, new long[] {1, 3, 11});
  }
}
