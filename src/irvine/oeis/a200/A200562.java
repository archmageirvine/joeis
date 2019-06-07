package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200562 Expansion of <code>1 / ((1 - 2*x) * (1 + 3*x + 4*x^2))</code> in powers of <code>x</code>.
 * @author Sean A. Irvine
 */
public class A200562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200562() {
    super(new long[] {8, 2, -1}, new long[] {1, -1, 3});
  }
}
