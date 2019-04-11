package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059827 Cubes of triangular numbers: <code>(n*(n+1)/2)^3</code>.
 * @author Sean A. Irvine
 */
public class A059827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059827() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 27, 216, 1000, 3375, 9261, 21952});
  }
}
