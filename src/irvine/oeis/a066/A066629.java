package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066629 a(n) = 2*Fibonacci(n+2) + ((-1)^n - 3)/2.
 * @author Sean A. Irvine
 */
public class A066629 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066629() {
    super(new long[] {-1, -1, 2, 1}, new long[] {1, 2, 5, 8});
  }
}
