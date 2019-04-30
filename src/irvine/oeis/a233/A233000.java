package irvine.oeis.a233;

import irvine.oeis.LinearRecurrence;

/**
 * A233000 Let <code>L(n) = Fibonacci(n-1)+Fibonacci(n+1)</code> (cf. A000045, A000032); if n is even then <code>a(n) = (L(n)+2)^2</code> otherwise <code>a(n) = L(2*n)+2</code>.
 * @author Sean A. Irvine
 */
public class A233000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233000() {
    super(new long[] {1, -3, -3, 12, 0, -12, 3, 3}, new long[] {16, 5, 25, 20, 81, 125, 400, 845});
  }
}
