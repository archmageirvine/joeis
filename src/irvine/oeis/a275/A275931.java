package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275931 <code>a(n) = F(2*n+3)*F(2*n+1)^3</code>, where F = Fibonacci <code>(A000045)</code>.
 * @author Sean A. Irvine
 */
public class A275931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275931() {
    super(new long[] {1, -55, 385, -385, 55}, new long[] {2, 40, 1625, 74698, 3498056});
  }
}
