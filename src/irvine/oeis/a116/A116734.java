package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116734 Number of permutations of length n which avoid the patterns 231, 1432, 4123.
 * @author Sean A. Irvine
 */
public class A116734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116734() {
    super(1, new long[] {1, -1, 0, -2, 3}, new long[] {1, 2, 5, 12, 25});
  }
}
