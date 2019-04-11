package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021204 Expansion of <code>1/((1-x)(1-2x)(1-6x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A021204 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021204() {
    super(new long[] {-132, 232, -119, 20}, new long[] {1, 20, 281, 3472});
  }
}
