package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028071 Expansion of <code>1/((1-3x)(1-5x)(1-10x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A028071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028071() {
    super(new long[] {-1650, 1195, -293, 29}, new long[] {1, 29, 548, 8590});
  }
}
