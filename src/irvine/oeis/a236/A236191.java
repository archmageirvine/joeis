package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236191 <code>(-1)^floor( (n-1) / 3 ) * F(n),</code> where F = Fibonacci.
 * @author Sean A. Irvine
 */
public class A236191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236191() {
    super(new long[] {1, 0, 0, -4, 0, 0}, new long[] {0, 1, 1, 2, -3, -5});
  }
}
