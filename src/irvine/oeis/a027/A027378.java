package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027378 Expansion of (1+x^2-x^3)/(1-x)^4.
 * @author Sean A. Irvine
 */
public class A027378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027378() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 4, 11, 23});
  }
}
