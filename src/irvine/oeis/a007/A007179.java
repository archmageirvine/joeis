package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007179 Dual pairs of integrals arising from reflection coefficients.
 * @author Sean A. Irvine
 */
public class A007179 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007179() {
    super(new long[] {-4, 2, 2}, new long[] {0, 1, 1});
  }
}
