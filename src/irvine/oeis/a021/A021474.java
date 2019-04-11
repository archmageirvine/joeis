package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021474 Expansion of <code>1/((1-x)(1-3x)(1-5x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A021474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021474() {
    super(new long[] {-165, 268, -122, 20}, new long[] {1, 20, 278, 3388});
  }
}
