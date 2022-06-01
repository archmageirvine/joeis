package irvine.oeis.a188;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A188021 Expansion of (x^2)/[(1-x)*(1-3*x^2-x^3)].
 * @author Sean A. Irvine
 */
public class A188021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188021() {
    super(new long[] {-1, -2, 3, 1}, new long[] {0, 0, 1, 1});
  }
}
