package irvine.oeis.a107;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A107904 Expansion of (1+6*x)/(1-12*x^2).
 * @author Sean A. Irvine
 */
public class A107904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107904() {
    super(new long[] {12, 0}, new long[] {1, 6});
  }
}
