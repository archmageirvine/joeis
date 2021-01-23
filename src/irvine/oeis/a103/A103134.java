package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103134 a(n) = Fibonacci(6n+4).
 * @author Sean A. Irvine
 */
public class A103134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103134() {
    super(new long[] {-1, 18}, new long[] {3, 55});
  }
}
