package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021129 Expansion of 1/((1-x)(1-2x)(1-5x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A021129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021129() {
    super(new long[] {-80, 146, -81, 16}, new long[] {1, 16, 175, 1650});
  }
}
