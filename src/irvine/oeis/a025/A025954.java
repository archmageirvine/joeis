package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025954 Expansion of 1/((1-2x)(1-3x)(1-9x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A025954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025954() {
    super(new long[] {-648, 666, -219, 26}, new long[] {1, 26, 457, 6854});
  }
}
