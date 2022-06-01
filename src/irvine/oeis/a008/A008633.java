package irvine.oeis.a008;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A008633 Molien series for A_10.
 * @author Sean A. Irvine
 */
public class A008633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008633() {
    super(new long[] {-1, 0, 2, 2, 0, -2, -3, -3, 0, 3, 3, 0, 0, 1, 2, 3, 1, -5, -8, -5, 0, 4, 4, 2, 0, 2, 4, 4, 0, -5, -8, -5, 1, 3, 2, 1, 0, 0, 3, 3, 0, -3, -3, -2, 0, 2, 2, 0},
      new long[] {1, 1, 2, 3, 5, 7, 11, 15, 22, 30, 42, 55, 75, 97, 128, 164, 212, 267, 340, 423, 530, 653, 807, 984, 1204, 1455, 1761, 2112, 2534, 3015, 3590, 4242, 5013, 5888, 6912, 8070, 9418, 10936, 12690, 14663, 16928, 19466, 22367, 25608, 29292, 33402, 38048, 43216});
  }
}

