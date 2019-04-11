package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025992 Expansion of <code>1/((1-2x)(1-5x)(1-7x)(1-8x))</code>.
 * @author Sean A. Irvine
 */
public class A025992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025992() {
    super(new long[] {-560, 542, -171, 22}, new long[] {1, 22, 313, 3666});
  }
}
