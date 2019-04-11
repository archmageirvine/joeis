package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157727 <code>a(n) =</code> Fibonacci(n) <code>+ 4</code>.
 * @author Sean A. Irvine
 */
public class A157727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157727() {
    super(new long[] {-1, 0, 2}, new long[] {4, 5, 5});
  }
}
