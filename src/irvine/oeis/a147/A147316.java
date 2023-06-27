package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147316 Fibonacci numbers (A000045) starting at offset -20.
 * @author Sean A. Irvine
 */
public class A147316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147316() {
    super(-20, new long[] {1, 1}, new long[] {-6765, 4181});
  }
}
