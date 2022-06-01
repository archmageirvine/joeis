package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025961 Expansion of 1/((1-2x)(1-4x)(1-5x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A025961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025961() {
    super(new long[] {-360, 382, -137, 20}, new long[] {1, 20, 263, 2902});
  }
}
