package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255457 a(n) = A255456(2^n-1).
 * @author Sean A. Irvine
 */
public class A255457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255457() {
    super(new long[] {17, 15, -24, 0, 5}, new long[] {1, 5, 23, 93, 359});
  }
}
