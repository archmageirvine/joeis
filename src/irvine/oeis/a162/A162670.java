package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162670 Expansion of x/(1 - x - 100*x^2).
 * @author Sean A. Irvine
 */
public class A162670 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162670() {
    super(1, new long[] {100, 1}, new long[] {1, 1});
  }
}
