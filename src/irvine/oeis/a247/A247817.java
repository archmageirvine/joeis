package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247817 Sum(4^k, k=2..n).
 * @author Sean A. Irvine
 */
public class A247817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247817() {
    super(1, new long[] {-4, 5}, new long[] {0, 16});
  }
}
