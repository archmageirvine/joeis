package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080957 Expansion of (5 - 9*x + 6*x^2)/(1-x)^4.
 * @author Sean A. Irvine
 */
public class A080957 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080957() {
    super(new long[] {-1, 4, -6, 4}, new long[] {5, 11, 20, 34});
  }
}
