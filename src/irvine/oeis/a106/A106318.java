package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106318 Bhaskara twins: n such that <code>2*n^2 =</code> X^3 and <code>2*n^3 =</code> Y^2.
 * @author Sean A. Irvine
 */
public class A106318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106318() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {2, 128, 1458, 8192, 31250, 93312, 235298});
  }
}
