package irvine.oeis.a092;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A092055 a(n) = binomial(2 + 2^n,3).
 * @author Sean A. Irvine
 */
public class A092055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092055() {
    super(new long[] {64, -56, 14}, new long[] {1, 4, 20});
  }
}
