package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022111 Expansion of <code>1/((1-x)(1-5x)(1-6x)(1-8x))</code>.
 * @author Sean A. Irvine
 */
public class A022111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022111() {
    super(new long[] {-240, 358, -137, 20}, new long[] {1, 20, 263, 2878});
  }
}
