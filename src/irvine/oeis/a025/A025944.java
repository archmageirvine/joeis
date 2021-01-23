package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025944 Expansion of 1/((1-2x)(1-3x)(1-7x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A025944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025944() {
    super(new long[] {-378, 411, -149, 21}, new long[] {1, 21, 292, 3414});
  }
}
