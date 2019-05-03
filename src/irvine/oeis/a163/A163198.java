package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163198 Sum of the cubes of the first <code>n even-indexed</code> Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A163198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163198() {
    super(new long[] {1, -22, 77, -77, 22}, new long[] {0, 1, 28, 540, 9801});
  }
}
