package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025961 Expansion of <code>1/((1-2x)(1-4x)(1-5x)(1-9x))</code>.
 * @author Sean A. Irvine
 */
public class A025961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025961() {
    super(new long[] {-360, 382, -137, 20}, new long[] {1, 20, 263, 2902});
  }
}
