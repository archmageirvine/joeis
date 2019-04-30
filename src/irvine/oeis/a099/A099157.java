package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099157 <code>a(n) = 4^(n-1)*U(n-1, 3/2)</code> where U is the Chebyshev polynomial of the second kind.
 * @author Sean A. Irvine
 */
public class A099157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099157() {
    super(new long[] {-16, 12}, new long[] {0, 1});
  }
}
