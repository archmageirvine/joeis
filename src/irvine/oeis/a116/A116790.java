package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116790 Number of permutations of length n which avoid the patterns 1423, 1432, 3241.
 * @author Sean A. Irvine
 */
public class A116790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116790() {
    super(new long[] {-1, -1, 6, -7, 5}, new long[] {1, 2, 6, 21, 74});
  }
}
