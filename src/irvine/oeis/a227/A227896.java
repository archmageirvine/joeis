package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227896 32-beat repeating palindromic sequence: digital roots of Fibonacci numbers indexed by the set of natural numbers not divisible by <code>2, 3</code> or 5 (A007775).
 * @author Sean A. Irvine
 */
public class A227896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227896() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 4, 8, 8, 4, 5, 1, 5, 4, 8, 4, 5, 1, 1, 5, 8, 8});
  }
}
