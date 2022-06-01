package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257272 a(n) = 2^(n-1)*(2^n+7).
 * @author Sean A. Irvine
 */
public class A257272 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257272() {
    super(new long[] {-8, 6}, new long[] {4, 9});
  }
}
