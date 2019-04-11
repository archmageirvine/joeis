package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133648 <code>a(n) = 2*3^n + 3^(n-1) - (n+1)</code>.
 * @author Sean A. Irvine
 */
public class A133648 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133648() {
    super(new long[] {3, -7, 5}, new long[] {5, 18, 59});
  }
}
