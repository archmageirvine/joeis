package irvine.oeis.a114;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A114091 Number of partitions of n into parts that are distinct mod 3.
 * @author Georg Fischer
 */
public class A114091 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A114091() {
    super(1, "[0, 1, 0, 0,-3, 0, 0, 3, 0, 0,-1]",
      "1, 1, 2, 2, 2, 4, 3, 3, 7", 0);
  }
}
