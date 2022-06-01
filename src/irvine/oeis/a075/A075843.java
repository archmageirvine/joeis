package irvine.oeis.a075;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A075843 Numbers k such that 99*k^2 + 1 is a square.
 * @author Sean A. Irvine
 */
public class A075843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075843() {
    super(new long[] {-1, 20}, new long[] {0, 1});
  }
}
