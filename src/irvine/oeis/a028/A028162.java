package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028162 Expansion of <code>1/((1-4x)(1-9x)(1-10x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A028162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028162() {
    super(new long[] {-4320, 2352, -442, 35}, new long[] {1, 35, 783, 14287});
  }
}
