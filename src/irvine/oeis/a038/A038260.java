package irvine.oeis.a038;

import irvine.oeis.GeneratingFunctionTriangle;

/**
 * A038260 Triangle read by rows: T(n,k) = binomial(n,k)*6^(n-k)*6^k, 0&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A038260 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A038260() {
    super(0, new long[] {1}, new long[] {1, -6, -6});
  }
}
