package irvine.oeis.a172;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A172242 Number of 10-D hypercubes in an n-dimensional hypercube.
 * @author Sean A. Irvine
 */
public class A172242 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172242() {
    super(new long[] {2048, -11264, 28160, -42240, 42240, -29568, 14784, -5280, 1320, -220, 22}, new long[] {1, 22, 264, 2288, 16016, 96096, 512512, 2489344, 11202048, 47297536, 189190144});
  }
}
