package irvine.oeis.a255;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A255471 a(n) = A255470(2^n-1).
 * @author Sean A. Irvine
 */
public class A255471 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255471() {
    super(new long[] {-8, 6, 3}, new long[] {1, 6, 24});
  }
}
