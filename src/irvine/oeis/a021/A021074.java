package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021074 Expansion of 1/((1-x)(1-2x)(1-4x)(1-5x)).
 * @author Sean A. Irvine
 */
public class A021074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021074() {
    super(new long[] {-40, 78, -49, 12}, new long[] {1, 12, 95, 630});
  }
}
