package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247840 Sum(6^k, k=2..n).
 * @author Sean A. Irvine
 */
public class A247840 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247840() {
    super(new long[] {-6, 7}, new long[] {0, 36});
  }
}
