package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147316 Fibonacci numbers (A000045) starting at offset <code>-20</code>.
 * @author Sean A. Irvine
 */
public class A147316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147316() {
    super(new long[] {1, 1}, new long[] {-6765, 4181});
  }
}
