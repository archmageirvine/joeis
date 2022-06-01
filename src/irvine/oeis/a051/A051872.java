package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051872 20-gonal (or icosagonal) numbers: a(n) = n*(9*n-8).
 * @author Sean A. Irvine
 */
public class A051872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051872() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 20});
  }
}
