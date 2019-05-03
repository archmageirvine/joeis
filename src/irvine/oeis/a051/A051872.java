package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051872 <code>20-gonal (or icosagonal)</code> numbers: <code>a(n) = n*(9*n-8)</code>.
 * @author Sean A. Irvine
 */
public class A051872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051872() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 20});
  }
}
