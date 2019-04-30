package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251895 Numbers n such that the sum of the octagonal numbers <code>N(n)</code> and <code>N(n+1)</code> is equal to another octagonal number.
 * @author Sean A. Irvine
 */
public class A251895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251895() {
    super(new long[] {1, -1, -1154, 1154, 1}, new long[] {0, 30, 368, 34814, 424864});
  }
}
