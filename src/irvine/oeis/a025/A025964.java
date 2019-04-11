package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025964 Expansion of <code>1/((1-2x)(1-4x)(1-5x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A025964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025964() {
    super(new long[] {-480, 496, -170, 23}, new long[] {1, 23, 359, 4843});
  }
}
