package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099100 <code>a(n) =</code> Fibonacci(5*n+1).
 * @author Sean A. Irvine
 */
public class A099100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099100() {
    super(new long[] {1, 11}, new long[] {1, 8});
  }
}
