package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028086 Expansion of <code>1/((1-3x)(1-6x)(1-10x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A028086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028086() {
    super(new long[] {-1980, 1368, -317, 30}, new long[] {1, 30, 583, 9348});
  }
}
