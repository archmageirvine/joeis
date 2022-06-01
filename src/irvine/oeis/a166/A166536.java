package irvine.oeis.a166;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A166536 A product of consecutive doubled Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A166536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166536() {
    super(new long[] {1, -3, 0, 3}, new long[] {1, 3, 6, 16});
  }
}
