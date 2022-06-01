package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153709 Expansion of (1 + 7*x)/(1 - 11*x - 26*x^2).
 * @author Sean A. Irvine
 */
public class A153709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153709() {
    super(new long[] {26, 11}, new long[] {1, 18});
  }
}
