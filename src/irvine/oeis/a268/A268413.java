package irvine.oeis.a268;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A268413 a(n) = Sum_{k = 0..n} (-1)^k*14^k.
 * @author Sean A. Irvine
 */
public class A268413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268413() {
    super(new long[] {14, -13}, new long[] {1, -13});
  }
}
