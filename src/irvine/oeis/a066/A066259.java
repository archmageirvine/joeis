package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066259 a(n) = Fibonacci(n)*Fibonacci(n+1)^2.
 * @author Sean A. Irvine
 */
public class A066259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066259() {
    super(new long[] {-1, -3, 6, 3}, new long[] {1, 4, 18, 75});
  }
}
