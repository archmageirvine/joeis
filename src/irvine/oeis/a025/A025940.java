package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025940 Expansion of 1/((1-2x)(1-3x)(1-6x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A025940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025940() {
    super(new long[] {-360, 396, -146, 21}, new long[] {1, 21, 295, 3525});
  }
}
