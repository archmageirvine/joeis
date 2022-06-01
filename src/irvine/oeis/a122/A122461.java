package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122461 Repetitions of even numbers four times.
 * @author Sean A. Irvine
 */
public class A122461 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122461() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 0, 0, 0, 2});
  }
}
