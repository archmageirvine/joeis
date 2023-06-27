package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158220 a(n) = 169*n^2 + 2*n.
 * @author Sean A. Irvine
 */
public class A158220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158220() {
    super(1, new long[] {1, -3, 3}, new long[] {171, 680, 1527});
  }
}
