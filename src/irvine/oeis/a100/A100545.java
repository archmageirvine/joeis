package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100545 Expansion of <code>(7-2*x) / (1-3*x+x^2)</code>.
 * @author Sean A. Irvine
 */
public class A100545 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100545() {
    super(new long[] {-1, 3}, new long[] {7, 19});
  }
}
