package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188510 Expansion of <code>x*(1 + x^2)/(1 + x^4)</code> in powers of <code>x</code>.
 * @author Sean A. Irvine
 */
public class A188510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188510() {
    super(new long[] {-1, 0, 0, 0}, new long[] {0, 1, 0, 1});
  }
}
