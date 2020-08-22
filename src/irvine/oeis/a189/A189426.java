package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189426 Expansion of (x^2)/(1-2*x-x^2+x^3)^2.
 * @author Sean A. Irvine
 */
public class A189426 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189426() {
    super(new long[] {-1, 2, 3, -6, -2, 4}, new long[] {0, 0, 1, 4, 14, 42});
  }
}
