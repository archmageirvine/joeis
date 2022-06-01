package irvine.oeis.a255;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A255467 a(n) = A255466(2^n-1).
 * @author Sean A. Irvine
 */
public class A255467 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255467() {
    super(new long[] {-8, -2, 5}, new long[] {1, 6, 26});
  }
}
