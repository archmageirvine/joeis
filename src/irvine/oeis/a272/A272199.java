package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272199 Expansion of <code>1/(1 - 2*x + 13*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A272199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272199() {
    super(new long[] {-13, 2}, new long[] {1, 2});
  }
}
