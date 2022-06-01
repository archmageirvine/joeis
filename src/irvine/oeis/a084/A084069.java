package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084069 Numbers k such that 7*k^2 = floor(k*sqrt(7)*ceiling(k*sqrt(7))).
 * @author Sean A. Irvine
 */
public class A084069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084069() {
    super(new long[] {-1, 0, 16, 0}, new long[] {1, 3, 17, 48});
  }
}
