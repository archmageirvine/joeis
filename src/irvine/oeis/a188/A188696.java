package irvine.oeis.a188;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A188696 Expansion of (1+x^2)/(1-26*x+x^2-26*x^3+2*x^4).
 * @author Sean A. Irvine
 */
public class A188696 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188696() {
    super(new long[] {-2, 26, -1, 26}, new long[] {1, 26, 676, 17576});
  }
}
