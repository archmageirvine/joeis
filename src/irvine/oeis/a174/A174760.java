package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174760 x-values in the solution to x^2-58*y^2=1.
 * @author Sean A. Irvine
 */
public class A174760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174760() {
    super(new long[] {-1, 39206}, new long[] {1, 19603});
  }
}
