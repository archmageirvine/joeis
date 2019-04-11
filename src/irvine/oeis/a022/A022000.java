package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022000 Expansion of <code>1/((1-x)(1-4x)(1-11x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A022000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022000() {
    super(new long[] {-528, 752, -251, 28}, new long[] {1, 28, 533, 8648});
  }
}
