package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133629 <code>a(1)=1, a(n) = a(n-1) + (p-1)*p^(n/2-1)</code> if n is even, otherwise <code>a(n) = a(n-1) + p^((n-1)/2)</code>, where <code>p=5</code>.
 * @author Sean A. Irvine
 */
public class A133629 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133629() {
    super(new long[] {-5, 5, 1}, new long[] {1, 5, 10});
  }
}
