package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028168 Expansion of 1/((1-5x)(1-6x)(1-7x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A028168 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028168() {
    super(new long[] {-2310, 1387, -305, 29}, new long[] {1, 29, 536, 8086});
  }
}
