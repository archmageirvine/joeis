package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077973 Expansion of <code>1/(1+x-2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077973() {
    super(new long[] {2, 0, -1}, new long[] {1, -1, 1});
  }
}
