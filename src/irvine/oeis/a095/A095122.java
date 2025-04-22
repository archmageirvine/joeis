package irvine.oeis.a095;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A095122 a(n) = Fibonacci(n)*(2*Fibonacci(n)-1).
 * @author Sean A. Irvine
 */
public class A095122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095122() {
    super(new long[] {1, -1, -5, 1, 3}, new long[] {0, 1, 1, 6, 15});
  }
}
