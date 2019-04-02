package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097113 Expansion of (1+5x-12x^2-80x^3)/(1-33x^2+272x^4).
 * @author Sean A. Irvine
 */
public class A097113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097113() {
    super(new long[] {-272, 0, 33, 0}, new long[] {1, 5, 21, 85});
  }
}
