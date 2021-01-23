package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108412 Expansion of (1 + x + x^2)/(1 - 4x^2 + x^4).
 * @author Sean A. Irvine
 */
public class A108412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108412() {
    super(new long[] {-1, 0, 4, 0}, new long[] {1, 1, 5, 4});
  }
}
