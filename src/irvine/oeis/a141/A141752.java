package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141752 a(n) = Sum_{k=0..n} [ Fibonacci(2k-1) + (n-k)*Fibonacci(2k) ].
 * @author Sean A. Irvine
 */
public class A141752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141752() {
    super(new long[] {-1, 5, -8, 5}, new long[] {1, 2, 5, 14});
  }
}
