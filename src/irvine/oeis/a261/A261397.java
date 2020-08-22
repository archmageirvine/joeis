package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261397 a(n) = 3^n*Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A261397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261397() {
    super(new long[] {9, 3}, new long[] {0, 3});
  }
}
