package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019672 Expansion of <code>1/((1-4x)(1-8x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A019672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019672() {
    super(new long[] {352, -164, 23}, new long[] {1, 23, 365});
  }
}
