package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049072 Expansion of <code>1/(1 - 3*x + 4*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A049072 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049072() {
    super(new long[] {-4, 3}, new long[] {1, 3});
  }
}
