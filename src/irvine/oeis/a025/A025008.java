package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025008 Expansion of 1/((1-x)(1-8x)(1-11x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A025008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025008() {
    super(new long[] {-1056, 1372, -347, 32}, new long[] {1, 32, 677, 11932});
  }
}
