package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128052 <code>a(n) =</code> (F(2n-1) + F(2n+1)) <code>* (5/6 -</code> cos(2*Pi*n/3)/3) where F(n) = Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A128052 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128052() {
    super(new long[] {-1, 0, 0, 18, 0, 0}, new long[] {1, 3, 7, 9, 47, 123});
  }
}
