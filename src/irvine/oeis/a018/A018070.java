package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018070 Expansion of <code>1/((1-3x)(1-8x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A018070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018070() {
    super(new long[] {264, -145, 22}, new long[] {1, 22, 339});
  }
}
