package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027674 Numerical distance between m-th and (m+n)-th spheres in loxodromic sequence of spheres in which each 5 consecutive spheres are in mutual contact.
 * @author Sean A. Irvine
 */
public class A027674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027674() {
    super(new long[] {-1, 1, 1, 1, 1}, new long[] {-1, 1, 1, 1, 1});
  }
}
