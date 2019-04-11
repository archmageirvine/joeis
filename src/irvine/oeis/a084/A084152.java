package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084152 Exponential self-convolution of Jacobsthal numbers (divided by <code>2)</code>.
 * @author Sean A. Irvine
 */
public class A084152 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084152() {
    super(new long[] {-8, 6, 3}, new long[] {0, 0, 1});
  }
}
