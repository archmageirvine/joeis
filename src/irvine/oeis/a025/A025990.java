package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025990 Expansion of <code>1/((1-2x)(1-5x)(1-6x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A025990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025990() {
    super(new long[] {-660, 632, -195, 24}, new long[] {1, 24, 381, 5096});
  }
}
