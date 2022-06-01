package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052917 Expansion of 1/(1-3*x-x^4).
 * @author Sean A. Irvine
 */
public class A052917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052917() {
    super(new long[] {1, 0, 0, 3}, new long[] {1, 3, 9, 27});
  }
}
