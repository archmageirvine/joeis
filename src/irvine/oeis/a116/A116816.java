package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116816 Number of permutations of length n which avoid the patterns 2314, 3124, 4312.
 * @author Sean A. Irvine
 */
public class A116816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116816() {
    super(1, new long[] {-2, 12, -28, 35, -24, 8}, new long[] {1, 2, 6, 21, 75, 260});
  }
}
