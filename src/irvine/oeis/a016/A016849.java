package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016849 Expansion of 1/((1-3x)(1-4x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A016849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016849() {
    super(new long[] {96, -68, 15}, new long[] {1, 15, 157});
  }
}
