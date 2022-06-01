package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078027 Expansion of (1 - x)/(1 - x^2 - x^3).
 * @author Sean A. Irvine
 */
public class A078027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078027() {
    super(new long[] {1, 1, 0}, new long[] {1, -1, 1});
  }
}
