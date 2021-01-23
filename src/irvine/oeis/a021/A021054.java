package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021054 Expansion of 1/((1-x)(1-2x)(1-3x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A021054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021054() {
    super(new long[] {-66, 127, -77, 17}, new long[] {1, 17, 212, 2422});
  }
}
