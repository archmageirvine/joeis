package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116796 Number of permutations of length n which avoid the patterns 2314, 3241, 4132.
 * @author Sean A. Irvine
 */
public class A116796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116796() {
    super(1, new long[] {1, -7, 17, -17, 7}, new long[] {1, 2, 6, 21, 72});
  }
}
