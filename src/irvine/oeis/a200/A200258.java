package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200258 <code>a(n) =</code> Fibonacci(8n+7) mod Fibonacci(8n+1).
 * @author Sean A. Irvine
 */
public class A200258 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200258() {
    super(new long[] {-1, 47}, new long[] {32, 1508});
  }
}
