package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052966 Expansion of (1-x)/(1-x-4x^2+2x^3).
 * @author Sean A. Irvine
 */
public class A052966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052966() {
    super(new long[] {-2, 4, 1}, new long[] {1, 0, 4});
  }
}
