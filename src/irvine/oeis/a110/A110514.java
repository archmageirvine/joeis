package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110514 Expansion of (1 - x + x^2 + x^3)/(1 - x^2 - x^4 + x^6).
 * @author Sean A. Irvine
 */
public class A110514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110514() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {1, -1, 2, 0, 3, -1});
  }
}
