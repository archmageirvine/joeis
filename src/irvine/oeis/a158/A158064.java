package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158064 a(n) = 36*n^2 + 2*n.
 * @author Sean A. Irvine
 */
public class A158064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158064() {
    super(1, new long[] {1, -3, 3}, new long[] {38, 148, 330});
  }
}
