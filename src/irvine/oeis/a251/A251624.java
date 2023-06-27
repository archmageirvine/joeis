package irvine.oeis.a251;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A251624 Numbers n such that the octagonal numbers N(n), N(n+1) and N(n+2) sum to another octagonal number.
 * @author Sean A. Irvine
 */
public class A251624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251624() {
    super(1, new long[] {1, -2703, 2703}, new long[] {278, 752958, 2034494038});
  }
}
