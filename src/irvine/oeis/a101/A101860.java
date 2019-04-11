package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101860 <code>a(n) = (3+n)*(2 + 33*n + n^2)/6</code>.
 * @author Sean A. Irvine
 */
public class A101860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101860() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 24, 60, 110});
  }
}
