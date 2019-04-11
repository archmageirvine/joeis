package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028140 Expansion of <code>1/((1-4x)(1-6x)(1-9x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A028140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028140() {
    super(new long[] {-2376, 1470, -323, 30}, new long[] {1, 30, 577, 9090});
  }
}
