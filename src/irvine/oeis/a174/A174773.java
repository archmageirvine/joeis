package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174773 y-values in the solution to x^2 - 34*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A174773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174773() {
    super(new long[] {-1, 70}, new long[] {0, 6});
  }
}
