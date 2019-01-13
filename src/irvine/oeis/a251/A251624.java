package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251624.
 * @author Sean A. Irvine
 */
public class A251624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251624() {
    super(new long[] {1, -2703, 2703}, new long[] {278, 752958, 2034494038});
  }
}
