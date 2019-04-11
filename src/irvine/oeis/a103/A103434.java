package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103434 <code>a(n) =</code> Sum_{i=1..n} Fibonacci(2i)^2.
 * @author Sean A. Irvine
 */
public class A103434 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103434() {
    super(new long[] {-1, 9, -16, 9}, new long[] {0, 1, 10, 74});
  }
}
