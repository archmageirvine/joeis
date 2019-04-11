package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257272 <code>a(n) = 2^(n-1)*(2^n+7)</code>.
 * @author Sean A. Irvine
 */
public class A257272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257272() {
    super(new long[] {-8, 6}, new long[] {4, 9});
  }
}
