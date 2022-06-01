package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025963 Expansion of 1/((1-2x)(1-4x)(1-5x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A025963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025963() {
    super(new long[] {-440, 458, -159, 22}, new long[] {1, 22, 325, 4110});
  }
}
