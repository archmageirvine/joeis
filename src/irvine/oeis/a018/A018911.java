package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018911 Expansion of 1/((1-4x)(1-5x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A018911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018911() {
    super(new long[] {180, -101, 18}, new long[] {1, 18, 223});
  }
}
