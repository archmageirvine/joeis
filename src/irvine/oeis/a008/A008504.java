package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008504 10-dimensional centered tetrahedral numbers.
 * @author Sean A. Irvine
 */
public class A008504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008504() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new long[] {1, 12, 78, 364, 1365, 4368, 12376, 31824, 75582, 167960, 352716});
  }
}

