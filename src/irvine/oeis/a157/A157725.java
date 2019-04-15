package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157725 <code>a(n) = Fibonacci(n) + 2</code>.
 * @author Sean A. Irvine
 */
public class A157725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157725() {
    super(new long[] {-1, 0, 2}, new long[] {2, 3, 3});
  }
}
