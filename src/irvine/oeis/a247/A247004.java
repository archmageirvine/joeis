package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247004 Denominator of <code>(n+4)/gcd(n, 4)^2, a 16-periodic</code> sequence that associates <code>A061037</code> with <code>A106617</code>.
 * @author Sean A. Irvine
 */
public class A247004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247004() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {4, 1, 2, 1, 2, 1, 2, 1, 4, 1, 2, 1, 1, 1, 2, 1});
  }
}
