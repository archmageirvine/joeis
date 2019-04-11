package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028044 Expansion of <code>1/((1-3x)(1-4x)(1-8x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A028044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028044() {
    super(new long[] {-960, 776, -218, 25}, new long[] {1, 25, 407, 5501});
  }
}
