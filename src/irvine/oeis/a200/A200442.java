package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200442 Expansion of <code>1/(1-31*x+x^2)</code>.
 * @author Sean A. Irvine
 */
public class A200442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200442() {
    super(new long[] {-1, 31}, new long[] {1, 31});
  }
}
