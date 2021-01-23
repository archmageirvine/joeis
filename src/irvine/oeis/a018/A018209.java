package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018209 Expansion of 1/((1-4x)(1-5x)(1-7x)).
 * @author Sean A. Irvine
 */
public class A018209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018209() {
    super(new long[] {140, -83, 16}, new long[] {1, 16, 173});
  }
}
