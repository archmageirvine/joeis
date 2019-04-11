package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078006 Expansion of <code>(1-x)/(1-x-2*x^2-2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A078006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078006() {
    super(new long[] {2, 2, 1}, new long[] {1, 0, 2});
  }
}
