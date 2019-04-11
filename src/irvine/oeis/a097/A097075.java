package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097075 Expansion of <code>(1-x-x^2)/(1-x-3*x^2-x^3)</code>.
 * @author Sean A. Irvine
 */
public class A097075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097075() {
    super(new long[] {1, 3, 1}, new long[] {1, 0, 2});
  }
}
