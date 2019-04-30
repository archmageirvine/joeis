package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251625 Numbers n such that the octagonal number <code>N(n)</code> is the sum of three consecutive octagonal numbers.
 * @author Sean A. Irvine
 */
public class A251625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251625() {
    super(new long[] {1, -2703, 2703}, new long[] {483, 1304163, 3523847043L});
  }
}
