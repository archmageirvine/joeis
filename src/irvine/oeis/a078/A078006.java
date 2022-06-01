package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078006 Expansion of (1-x)/(1-x-2*x^2-2*x^3).
 * @author Sean A. Irvine
 */
public class A078006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078006() {
    super(new long[] {2, 2, 1}, new long[] {1, 0, 2});
  }
}
