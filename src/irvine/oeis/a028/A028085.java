package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028085 Expansion of 1/((1-3x)(1-6x)(1-9x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A028085 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028085() {
    super(new long[] {-1944, 1350, -315, 30}, new long[] {1, 30, 585, 9450});
  }
}
