package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116789 Number of permutations of length n which avoid the patterns 1234, 2431, 3241.
 * @author Sean A. Irvine
 */
public class A116789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116789() {
    super(1, new long[] {1, -1, -2, 1, 2, 3, -8, 5}, new long[] {1, 2, 6, 21, 73, 231, 650, 1668});
  }
}
