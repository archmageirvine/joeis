package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134492 a(n) = Fibonacci(6*n).
 * @author Sean A. Irvine
 */
public class A134492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134492() {
    super(new long[] {-1, 18}, new long[] {0, 8});
  }
}
