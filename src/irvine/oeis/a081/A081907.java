package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081907 Fifth binomial transform of binomial(n+2, 2).
 * @author Sean A. Irvine
 */
public class A081907 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081907() {
    super(new long[] {216, -108, 18}, new long[] {1, 8, 61});
  }
}
