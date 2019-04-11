package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028065 Expansion of <code>1/((1-3x)(1-5x)(1-8x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A028065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028065() {
    super(new long[] {-1200, 910, -239, 26}, new long[] {1, 26, 437, 6058});
  }
}
