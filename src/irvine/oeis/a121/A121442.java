package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121442 Expansion of (1-x^2)/(1-x-9*x^2+x^3).
 * @author Sean A. Irvine
 */
public class A121442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121442() {
    super(new long[] {-1, 9, 1}, new long[] {1, 1, 9});
  }
}
