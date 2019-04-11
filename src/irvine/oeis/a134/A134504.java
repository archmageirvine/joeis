package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134504 <code>a(n) =</code> Fibonacci(7n <code>+ 6)</code>.
 * @author Sean A. Irvine
 */
public class A134504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134504() {
    super(new long[] {1, 29}, new long[] {8, 233});
  }
}
