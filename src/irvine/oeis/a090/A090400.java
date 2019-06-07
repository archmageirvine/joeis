package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090400 Expansion of <code>1/(1-3x+3x^3)</code> in powers of <code>x</code>.
 * @author Sean A. Irvine
 */
public class A090400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090400() {
    super(new long[] {-3, 0, 3}, new long[] {1, 3, 9});
  }
}
