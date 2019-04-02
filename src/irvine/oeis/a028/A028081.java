package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028081 Expansion of 1/((1-3x)(1-6x)(1-8x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A028081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028081() {
    super(new long[] {-1584, 1134, -277, 28}, new long[] {1, 28, 507, 7574});
  }
}
