package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167602 Expansion of 1/(1+14*x+72*x^2+384*x^3+512*x^4).
 * @author Sean A. Irvine
 */
public class A167602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167602() {
    super(new long[] {-512, -384, -72, -14}, new long[] {1, -14, 124, -1112});
  }
}
