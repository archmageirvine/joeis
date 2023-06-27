package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122650 Fibonacci numbers starting at F(23).
 * @author Sean A. Irvine
 */
public class A122650 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122650() {
    super(1, new long[] {1, 1}, new long[] {28657, 46368});
  }
}
