package irvine.oeis.a275;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A275060 Numbers n such that there exists x in N : (x+1)^3 - x^3 = 61*n^2.
 * @author Sean A. Irvine
 */
public class A275060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275060() {
    super(1, new long[] {-1, 974}, new long[] {1, 973});
  }
}
