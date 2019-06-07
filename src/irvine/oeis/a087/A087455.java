package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087455 Expansion of <code>(1 - x)/(1 - 2*x + 3*x^2)</code> in powers of <code>x</code>.
 * @author Sean A. Irvine
 */
public class A087455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087455() {
    super(new long[] {-3, 2}, new long[] {1, 1});
  }
}
