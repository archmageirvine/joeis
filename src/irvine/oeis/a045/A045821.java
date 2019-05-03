package irvine.oeis.a045;

import irvine.oeis.LinearRecurrence;

/**
 * A045821 Numerical distance between m-th and <code>(n+m)-th</code> circles in a loxodromic sequence of circles in which each 4 consecutive circles touch.
 * @author Sean A. Irvine
 */
public class A045821 extends LinearRecurrence {

  /** Construct the sequence. */
  public A045821() {
    super(new long[] {-1, 2, 2, 2}, new long[] {-1, 1, 1, 1});
  }
}
