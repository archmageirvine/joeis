package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077961 Expansion of <code>1 / (1 + x^2 - x^3)</code> in powers of <code>x</code>.
 * @author Sean A. Irvine
 */
public class A077961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077961() {
    super(new long[] {1, -1, 0}, new long[] {1, 0, -1});
  }
}
