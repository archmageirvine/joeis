package irvine.oeis.a212;
// manually 2021-05-29

import irvine.oeis.HolonomicRecurrence;

/**
 * A212774 Amounts (in cents) of coins in denominations 1, 5, 10, 25, and 50 (cents) which, when using the minimal number of coins, have equal numbers of all denominations used.
 * @author Georg Fischer
 */
public class A212774 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A212774() {
    super(1, "[[0],[41,-1],[-42, 1]]", "0, 1, 2, 3, 4, 5, 6, 10, 11, 15, 16, 20, 22, 25, 26, 30, 31, 35, 36, 40, 41, 50, 51, 55, 56, 60, 61, 65, 66, 75, 76, 80, 81, 85, 86, 90, 91, 100, 102, 120, 122, 150, 153, 200, 204, 250, 300", 0);
  }
}
