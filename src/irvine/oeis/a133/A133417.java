package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133417 <code>a(n) = sqrt(2*(P(n)^4 + 16*P(n+1)^4 + P(n+2)^4))</code>, where <code>P() =</code> Pell numbers <code>A000129</code>.
 * @author Sean A. Irvine
 */
public class A133417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133417() {
    super(new long[] {-1, 5, 5}, new long[] {2, 8, 42});
  }
}
