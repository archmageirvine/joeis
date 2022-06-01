package irvine.oeis.a160;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A160175 Expansion of 1/(1 - 2*x - 2*x^2 - 2*x^3 - 2*x^4).
 * @author Sean A. Irvine
 */
public class A160175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160175() {
    super(new long[] {2, 2, 2, 2}, new long[] {1, 2, 6, 18});
  }
}
