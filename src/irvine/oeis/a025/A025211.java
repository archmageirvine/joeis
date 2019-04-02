package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025211 Expansion of 1/((1-2x)(1-3x)(1-4x)(1-5x)).
 * @author Sean A. Irvine
 */
public class A025211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025211() {
    super(new long[] {-120, 154, -71, 14}, new long[] {1, 14, 125, 910});
  }
}
