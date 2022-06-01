package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094967 Right-hand neighbors of Fibonacci numbers in Stern's diatomic series.
 * @author Sean A. Irvine
 */
public class A094967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094967() {
    super(new long[] {-1, 0, 3, 0}, new long[] {1, 1, 2, 2});
  }
}
