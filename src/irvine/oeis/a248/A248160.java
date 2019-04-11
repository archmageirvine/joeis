package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248160 Expansion of <code>(1 - 2*x^2)/(1 + x)^5.</code> Fourth column of Riordan triangle A248156.
 * @author Sean A. Irvine
 */
public class A248160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248160() {
    super(new long[] {-1, -5, -10, -10, -5}, new long[] {1, -5, 13, -25, 40});
  }
}
