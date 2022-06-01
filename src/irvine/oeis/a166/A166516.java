package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166516 A product of consecutive doubled Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A166516 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166516() {
    super(new long[] {1, -3, 0, 3}, new long[] {1, 1, 2, 4});
  }
}
