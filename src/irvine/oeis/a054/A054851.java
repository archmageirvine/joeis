package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054851 <code>a(n) =</code> 2^(n-7)*binomial(n,7). Number of 7D hypercubes in an n-dimensional hypercube.
 * @author Sean A. Irvine
 */
public class A054851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054851() {
    super(new long[] {-256, 1024, -1792, 1792, -1120, 448, -112, 16}, new long[] {1, 16, 144, 960, 5280, 25344, 109824, 439296});
  }
}
