package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078031 Expansion of (1-x)/(1 + x^2 - x^3).
 * @author Sean A. Irvine
 */
public class A078031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078031() {
    super(new long[] {1, -1, 0}, new long[] {1, -1, -1});
  }
}
