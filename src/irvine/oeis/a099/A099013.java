package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099013 <code>a(n) =</code> Sum_{k=0..n} 3^(k-1)*Fibonacci(k).
 * @author Sean A. Irvine
 */
public class A099013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099013() {
    super(new long[] {-9, 6, 4}, new long[] {0, 1, 4});
  }
}
