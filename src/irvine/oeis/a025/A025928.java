package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025928 Expansion of 1/((1-2x)(1-3x)(1-4x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A025928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025928() {
    super(new long[] {-264, 310, -125, 20}, new long[] {1, 20, 275, 3310});
  }
}
