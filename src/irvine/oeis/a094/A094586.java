package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094586 Central numbers of the triangle T of all positive differences of distinct Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A094586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094586() {
    super(1, new long[] {1, -2, -3, 4}, new long[] {1, 5, 16, 47});
  }
}
