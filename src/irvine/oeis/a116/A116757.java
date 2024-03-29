package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116757 Number of permutations of length n which avoid the patterns 1324, 2314, 4312.
 * @author Sean A. Irvine
 */
public class A116757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116757() {
    super(1, new long[] {-8, 36, -66, 63, -33, 9}, new long[] {1, 2, 6, 21, 73, 238});
  }
}
