package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087455 Expansion of (1 - x)/(1 - 2*x + 3*x^2) in powers of x.
 * @author Sean A. Irvine
 */
public class A087455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087455() {
    super(new long[] {-3, 2}, new long[] {1, 1});
  }
}
