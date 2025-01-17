package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247840 a(n) = Sum_{k=2..n} 6^k.
 * @author Sean A. Irvine
 */
public class A247840 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247840() {
    super(1, new long[] {-6, 7}, new long[] {0, 36});
  }
}
