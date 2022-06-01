package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028125 Expansion of 1/((1-4x)(1-5x)(1-9x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A028125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028125() {
    super(new long[] {-1980, 1291, -299, 29}, new long[] {1, 29, 542, 8338});
  }
}
