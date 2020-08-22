package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077421 Chebyshev sequence U(n,11)=S(n,22) with Diophantine property.
 * @author Sean A. Irvine
 */
public class A077421 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077421() {
    super(new long[] {-1, 22}, new long[] {1, 22});
  }
}
