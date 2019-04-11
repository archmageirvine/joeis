package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271535 <code>a(n) = ( n*(n + 1)*(2*n + 1)/6 )^2</code>.
 * @author Sean A. Irvine
 */
public class A271535 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271535() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 25, 196, 900, 3025, 8281});
  }
}
