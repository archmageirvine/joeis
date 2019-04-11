package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158321 <code>a(n) = 441n^2 + 2n</code>.
 * @author Sean A. Irvine
 */
public class A158321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158321() {
    super(new long[] {1, -3, 3}, new long[] {443, 1768, 3975});
  }
}
