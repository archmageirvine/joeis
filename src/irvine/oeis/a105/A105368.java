package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105368 Expansion of (1-x-x^3+x^4)/(1-x^5).
 * @author Sean A. Irvine
 */
public class A105368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105368() {
    super(new long[] {-1, -1, -1, -1}, new long[] {1, -1, 0, -1});
  }
}
