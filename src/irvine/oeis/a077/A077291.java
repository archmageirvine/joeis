package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077291 Second member of Diophantine pair <code>(m,k)</code> that satisfies <code>6*(m^2 + m) = k^2 +</code> k: <code>a(n) =</code> k.
 * @author Sean A. Irvine
 */
public class A077291 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077291() {
    super(new long[] {1, -1, -10, 10, 1}, new long[] {0, 3, 8, 35, 84});
  }
}
