package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077959 Expansion of <code>1/(1+2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A077959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077959() {
    super(new long[] {-2, 0, 0}, new long[] {1, 0, 0});
  }
}
