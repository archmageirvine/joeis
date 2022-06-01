package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052538 Expansion of (1-x)/(1-2*x-3*x^2+3*x^3).
 * @author Sean A. Irvine
 */
public class A052538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052538() {
    super(new long[] {-3, 3, 2}, new long[] {1, 1, 5});
  }
}
