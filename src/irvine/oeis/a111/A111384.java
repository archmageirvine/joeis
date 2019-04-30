package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111384 <code>a(n) = binomial(n,3) - binomial(floor(n/2),3) - binomial(ceiling(n/2),3)</code>.
 * @author Sean A. Irvine
 */
public class A111384 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111384() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 0, 0, 1, 4, 9});
  }
}
