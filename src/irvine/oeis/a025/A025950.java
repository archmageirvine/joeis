package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025950 Expansion of <code>1/((1-2x)(1-3x)(1-8x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A025950 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025950() {
    super(new long[] {-528, 554, -189, 24}, new long[] {1, 24, 387, 5306});
  }
}
