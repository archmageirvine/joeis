package irvine.oeis.a236;

import irvine.oeis.LinearRecurrence;

/**
 * A236428 <code>a(n) =</code> F(n+1)^2 + F(n+1)*F(n) - F(n)^2, where F = A000045.
 * @author Sean A. Irvine
 */
public class A236428 extends LinearRecurrence {

  /** Construct the sequence. */
  public A236428() {
    super(new long[] {-1, 2, 2}, new long[] {1, 1, 5});
  }
}
