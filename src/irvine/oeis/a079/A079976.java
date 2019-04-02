package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079976 G.f.: 1/(1-x-x^2-x^4-x^5).
 * @author Sean A. Irvine
 */
public class A079976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079976() {
    super(new long[] {1, 1, 0, 1, 1}, new long[] {1, 1, 2, 3, 6});
  }
}
