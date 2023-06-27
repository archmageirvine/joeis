package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165527 Number of permutations of length n which avoid the patterns 4231 and 2143.
 * @author Sean A. Irvine
 */
public class A165527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165527() {
    super(1, new long[] {3, -31, 133, -311, 438, -386, 213, -71, 13}, new long[] {1, 2, 6, 22, 86, 335, 1271, 4680, 16766});
  }
}
