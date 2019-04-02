package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025941 Expansion of 1/((1-2x)(1-3x)(1-6x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A025941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025941() {
    super(new long[] {-396, 432, -157, 22}, new long[] {1, 22, 327, 4172});
  }
}
