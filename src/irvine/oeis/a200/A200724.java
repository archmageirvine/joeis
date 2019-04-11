package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200724 Expansion of <code>1/(1-35*x+x^2)</code>.
 * @author Sean A. Irvine
 */
public class A200724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200724() {
    super(new long[] {-1, 35}, new long[] {1, 35});
  }
}
