package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116828 Number of permutations of length n which avoid the patterns 2413, 3421, 4123.
 * @author Sean A. Irvine
 */
public class A116828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116828() {
    super(new long[] {-1, -2, 27, -86, 144, -150, 100, -42, 10}, new long[] {1, 2, 6, 21, 73, 245, 804, 2617, 8511});
  }
}
