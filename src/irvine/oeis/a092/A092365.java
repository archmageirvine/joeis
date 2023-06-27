package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092365 Coefficient of X^2 in expansion of (1 + n*X + n*X^2)^n.
 * @author Sean A. Irvine
 */
public class A092365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092365() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {1, 8, 36, 112, 275});
  }
}
