package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025964 Expansion of 1/((1-2x)(1-4x)(1-5x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A025964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025964() {
    super(new long[] {-480, 496, -170, 23}, new long[] {1, 23, 359, 4843});
  }
}
