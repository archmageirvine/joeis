package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078008 Expansion of <code>(1-x)/(1 - x - 2*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A078008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078008() {
    super(new long[] {2, 1}, new long[] {1, 0});
  }
}
