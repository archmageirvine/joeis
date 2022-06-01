package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158321 a(n) = 441n^2 + 2n.
 * @author Sean A. Irvine
 */
public class A158321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158321() {
    super(new long[] {1, -3, 3}, new long[] {443, 1768, 3975});
  }
}
