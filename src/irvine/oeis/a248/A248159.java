package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248159 Expansion of <code>(1 - 2*x^2)/(1 + x)^4</code>. Third column of Riordan triangle <code>A248156</code>.
 * @author Sean A. Irvine
 */
public class A248159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248159() {
    super(new long[] {-1, -4, -6, -4}, new long[] {1, -4, 8, -12});
  }
}
