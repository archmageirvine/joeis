package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077975 Expansion of <code>1/(1+x+x^2-2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077975() {
    super(new long[] {2, -1, -1}, new long[] {1, -1, 0});
  }
}
