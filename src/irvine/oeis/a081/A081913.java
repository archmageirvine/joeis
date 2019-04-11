package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081913 <code>a(n) = 2^n*(n^3 - 3n^2 + 2n + 48)/48</code>.
 * @author Sean A. Irvine
 */
public class A081913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081913() {
    super(new long[] {-16, 32, -24, 8}, new long[] {1, 2, 4, 9});
  }
}
