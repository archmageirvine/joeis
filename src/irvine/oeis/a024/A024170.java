package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024170 Expansion of <code>1/((1-x)(1-6x)(1-9x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A024170 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024170() {
    super(new long[] {-540, 744, -229, 26}, new long[] {1, 26, 447, 6412});
  }
}
