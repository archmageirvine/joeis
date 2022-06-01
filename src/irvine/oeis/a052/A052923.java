package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052923 Expansion of (1-x)/(1 - x - 4*x^2).
 * @author Sean A. Irvine
 */
public class A052923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052923() {
    super(new long[] {4, 1}, new long[] {1, 0});
  }
}
