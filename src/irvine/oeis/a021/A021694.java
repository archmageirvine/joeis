package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021694 Expansion of <code>1/((1-x)(1-3x)(1-9x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A021694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021694() {
    super(new long[] {-297, 456, -182, 24}, new long[] {1, 24, 394, 5544});
  }
}
