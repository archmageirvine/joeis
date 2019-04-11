package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072130 <code>a(n+1) -3*a(n) + a(n-1) =</code> (2/3)*(1+w^(n+1)+w^(2*n+2)); <code>a(1) = 0, a(2) = 1</code>; where w is the cubic root of unity.
 * @author Sean A. Irvine
 */
public class A072130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072130() {
    super(new long[] {1, -3, 1, -1, 3}, new long[] {0, 1, 5, 14, 37});
  }
}
