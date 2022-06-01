package irvine.oeis.a200;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A200724 Expansion of 1/(1-35*x+x^2).
 * @author Sean A. Irvine
 */
public class A200724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200724() {
    super(new long[] {-1, 35}, new long[] {1, 35});
  }
}
