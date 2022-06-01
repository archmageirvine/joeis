package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116702 Number of permutations of length n which avoid the patterns 123, 3241.
 * @author Sean A. Irvine
 */
public class A116702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116702() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 2, 5, 13});
  }
}
