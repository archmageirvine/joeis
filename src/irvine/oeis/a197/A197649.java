package irvine.oeis.a197;

import irvine.oeis.LinearRecurrence;

/**
 * A197649 <code>Sum(k*Fibonacci(2*k), k=0..n)</code>, Fibonacci(n)=A000045(n).
 * @author Sean A. Irvine
 */
public class A197649 extends LinearRecurrence {

  /** Construct the sequence. */
  public A197649() {
    super(new long[] {-1, 6, -11, 6}, new long[] {0, 1, 7, 31});
  }
}
