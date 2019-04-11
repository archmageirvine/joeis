package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025963 Expansion of <code>1/((1-2x)(1-4x)(1-5x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A025963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025963() {
    super(new long[] {-440, 458, -159, 22}, new long[] {1, 22, 325, 4110});
  }
}
