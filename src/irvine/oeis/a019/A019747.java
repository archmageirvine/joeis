package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019747 Expansion of <code>1/((1-4x)(1-10x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A019747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019747() {
    super(new long[] {480, -208, 26}, new long[] {1, 26, 468});
  }
}
