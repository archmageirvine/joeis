package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020584 Expansion of <code>1/((1-6x)(1-8x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A020584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020584() {
    super(new long[] {480, -188, 24}, new long[] {1, 24, 388});
  }
}
