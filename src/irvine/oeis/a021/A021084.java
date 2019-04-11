package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021084 Expansion of <code>1/((1-x)(1-2x)(1-4x)(1-9x))</code>.
 * @author Sean A. Irvine
 */
public class A021084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021084() {
    super(new long[] {-72, 134, -77, 16}, new long[] {1, 16, 179, 1766});
  }
}
