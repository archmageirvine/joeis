package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245301 <code>a(n) = n*(7*n^2 + 15*n + 8)/6</code>.
 * @author Sean A. Irvine
 */
public class A245301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245301() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 5, 22, 58});
  }
}
