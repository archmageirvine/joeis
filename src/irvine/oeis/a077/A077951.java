package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077951 Expansion of <code>1/(1-x+x^2-2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077951() {
    super(new long[] {2, -1, 1}, new long[] {1, 1, 0});
  }
}
