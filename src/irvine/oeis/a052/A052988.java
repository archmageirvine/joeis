package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052988 Expansion of <code>(1-x^2)/(1-2x-2x^2+x^3+x^4)</code>.
 * @author Sean A. Irvine
 */
public class A052988 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052988() {
    super(new long[] {-1, -1, 2, 2}, new long[] {1, 2, 5, 13});
  }
}
