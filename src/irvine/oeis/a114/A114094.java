package irvine.oeis.a114;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A114094 Number of partitions of n into parts that are distinct mod 6.
 * @author Georg Fischer
 */
public class A114094 extends HolonomicRecurrence {

  public A114094() {
    super(1, "[0,-1, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0,-15, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0,-15, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0,-1]",
      "1, 1, 2, 2, 3, 4, 5, 5, 8, 8, 10, 13, 14, 15, 21, 22, 24, 32, 31, 35, 46, 49, 49, 66, 60, 70, 91, 95, 90, 121, 106, 126, 168, 167, 153, 204", 0);
  }
}
