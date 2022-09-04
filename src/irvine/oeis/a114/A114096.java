package irvine.oeis.a114;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A114096 Number of partitions of n into parts that are distinct mod 8.
 * @author Georg Fischer
 */
public class A114096 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A114096() {
    super(1, "[0,-1, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0,-28, 0, 0, 0, 0, 0, 0, 0, 56, 0, 0, 0, 0, 0, 0, 0,-70, 0, 0, 0, 0, 0, 0, 0, 56, 0, 0, 0, 0, 0, 0, 0,-28, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0,-1]",
      "1, 1, 2, 2, 3, 4, 5, 6, 8, 9, 12, 13, 16, 20, 23, 26, 31, 37, 42, 47, 54, 65, 72, 80, 90, 108, 115, 129, 145, 168, 184, 200, 220, 259, 270, 301, 336, 375, 411, 436, 477, 546, 568, 631, 700, 755, 832, 862, 945, 1050, 1099, 1226, 1344, 1407, 1561, 1583, 1744, 1884, 1990, 2250, 2418, 2468, 2756, 2743", 0);
  }
}
