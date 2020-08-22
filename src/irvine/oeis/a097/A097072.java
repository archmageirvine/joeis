package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097072 Expansion of (1 - 2*x + 2*x^2)/((1 - x^2)*(1 - 2*x)).
 * @author Sean A. Irvine
 */
public class A097072 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097072() {
    super(new long[] {-2, 1, 2}, new long[] {1, 0, 3});
  }
}
