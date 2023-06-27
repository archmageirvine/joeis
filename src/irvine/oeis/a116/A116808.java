package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116808 Number of permutations of length n which avoid the patterns 1342, 3214, 4312.
 * @author Sean A. Irvine
 */
public class A116808 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116808() {
    super(1, new long[] {-2, 11, -21, 6, 41, -78, 69, -34, 9}, new long[] {1, 2, 6, 21, 71, 213, 569, 1389, 3175});
  }
}
