package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077979 Expansion of <code>1/(1+x+2*x^2+x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077979() {
    super(new long[] {-1, -2, -1}, new long[] {1, -1, -1});
  }
}
