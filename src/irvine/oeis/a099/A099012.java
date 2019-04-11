package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099012 <code>a(n) =</code> 3^(n-1)*Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A099012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099012() {
    super(new long[] {9, 3}, new long[] {0, 1});
  }
}
