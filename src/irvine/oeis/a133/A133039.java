package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133039 <code>a(n) =</code> P(n)^3 - P(n)^2 where P(n) = A000931(n).
 * @author Sean A. Irvine
 */
public class A133039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133039() {
    super(new long[] {-1, 1, -2, 1, -3, 9, -9, 15, -3, 3, -9, 3, -9, 1, 2, 2}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 18, 48, 100, 294, 648, 1584});
  }
}
