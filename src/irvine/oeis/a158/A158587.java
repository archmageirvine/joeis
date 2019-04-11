package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158587 <code>a(n) = 289*n^2 - 17</code>.
 * @author Sean A. Irvine
 */
public class A158587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158587() {
    super(new long[] {1, -3, 3}, new long[] {272, 1139, 2584});
  }
}
