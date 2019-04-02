package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025970 Expansion of 1/((1-2x)(1-4x)(1-6x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A025970 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025970() {
    super(new long[] {-576, 576, -188, 24}, new long[] {1, 24, 388, 5376});
  }
}
