package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195339 Expansion of 1/(1-4*x+2*x^3+x^4).
 * @author Sean A. Irvine
 */
public class A195339 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195339() {
    super(new long[] {-1, -2, 0, 4}, new long[] {1, 4, 16, 62});
  }
}
