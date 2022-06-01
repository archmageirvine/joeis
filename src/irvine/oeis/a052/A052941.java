package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052941 Expansion of (1-x)/(1 - 4*x + x^2 + x^3).
 * @author Sean A. Irvine
 */
public class A052941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052941() {
    super(new long[] {-1, -1, 4}, new long[] {1, 3, 11});
  }
}
