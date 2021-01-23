package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176370 x-values in the solution to x^2 - 66*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A176370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176370() {
    super(new long[] {-1, 130}, new long[] {1, 65});
  }
}
