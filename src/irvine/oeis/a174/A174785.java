package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174785 Expansion of (1+2x-x^2+x^3-x^4-x^5)/(1+x^3)^2.
 * @author Sean A. Irvine
 */
public class A174785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174785() {
    super(new long[] {-1, 0, 0, -2, 0, 0}, new long[] {1, 2, -1, -1, -5, 1});
  }
}
