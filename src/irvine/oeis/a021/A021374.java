package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021374 Expansion of 1/((1-x)(1-3x)(1-4x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A021374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021374() {
    super(new long[] {-96, 164, -83, 16}, new long[] {1, 16, 173, 1604});
  }
}
