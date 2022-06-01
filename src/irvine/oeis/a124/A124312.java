package irvine.oeis.a124;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A124312 G.f.: (x^3 - x^4)/(1 - x - x^2 - x^3 - x^4 - x^5).
 * @author Sean A. Irvine
 */
public class A124312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124312() {
    super(new long[] {1, 1, 1, 1, 1}, new long[] {0, 0, 1, 0, 1});
  }
}
