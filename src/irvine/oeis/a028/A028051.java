package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028051 Expansion of 1/((1-3x)(1-4x)(1-10x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A028051 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028051() {
    super(new long[] {-1440, 1104, -286, 29}, new long[] {1, 29, 555, 8905});
  }
}
