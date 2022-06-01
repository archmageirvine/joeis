package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105385 Expansion of (1-x^2)/(1-x^5).
 * @author Sean A. Irvine
 */
public class A105385 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105385() {
    super(new long[] {-1, -1, -1, -1}, new long[] {1, 0, -1, 0});
  }
}
