package irvine.oeis.a114;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A114095 Number of partitions of n into parts that are distinct mod 7.
 * @author Georg Fischer
 */
public class A114095 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A114095() {
    super(1, "[0, 1, 0, 0, 0, 0, 0, 0,-7, 0, 0, 0, 0, 0, 0, 21, 0, 0, 0, 0, 0, 0,-35, 0, 0, 0, 0, 0, 0, 35, 0, 0, 0, 0, 0, 0,-21, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0,-1]",
      "1, 1, 2, 2, 3, 4, 5, 6, 7, 10, 10, 13, 16, 18, 21, 24, 31, 31, 38, 44, 49, 56, 62, 76, 76, 90, 100, 113, 126, 136, 161, 161, 186, 201, 234, 252, 267, 308, 308, 349, 370, 449, 462, 483, 546, 546, 609, 637, 813", 0);
  }
}
