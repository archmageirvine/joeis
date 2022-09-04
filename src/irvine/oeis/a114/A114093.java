package irvine.oeis.a114;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A114093 Number of partitions of n into parts that are distinct mod 5.
 * @author Georg Fischer
 */
public class A114093 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A114093() {
    super(1, "[0, 1, 0, 0, 0, 0,-5, 0, 0, 0, 0, 10, 0, 0, 0, 0,-10, 0, 0, 0, 0, 5, 0, 0, 0, 0,-1]",
      "1, 1, 2, 2, 3, 4, 4, 6, 6, 8, 10, 10, 13, 13, 18, 20, 20, 24, 24, 36, 35, 35, 40, 40, 66", 0);
  }
}
