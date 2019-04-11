package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264894 <code>a(n) = n*(7*n - 5)*(49*n^2 - 35*n - 10)/8</code>.
 * @author Sean A. Irvine
 */
public class A264894 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264894() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 261, 1956, 7291});
  }
}
