package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029941 Number of symmetric types of (4,2n)-hypergraphs under action of complementing group C(4,2).
 * @author Sean A. Irvine
 */
public class A029941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029941() {
    super(new long[] {-1, 4, -4, -4, 11, -8, 0, 8, -10, 0, 8, 0, -10, 8, 0, -8, 11, -4, -4, 4}, new long[] {1, 15, 50, 225, 590, 1485, 3130, 6435, 11931, 21450, 36220, 59670, 94140, 145350, 217500, 319770, 458981, 648945, 900350, 1233375});
  }
}
