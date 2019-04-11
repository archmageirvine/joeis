package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025930 Expansion of <code>1/((1-2x)(1-3x)(1-5x)(1-6x))</code>.
 * @author Sean A. Irvine
 */
public class A025930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025930() {
    super(new long[] {-180, 216, -91, 16}, new long[] {1, 16, 165, 1400});
  }
}
