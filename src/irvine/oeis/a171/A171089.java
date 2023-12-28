package irvine.oeis.a171;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A171089 a(n) = 2*(Lucas(n)^2 - (-1)^n).
 * @author Sean A. Irvine
 */
public class A171089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171089() {
    super(new long[] {-1, 2, 2}, new long[] {6, 4, 16});
  }
}
