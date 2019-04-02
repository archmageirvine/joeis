package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165530 Number of permutations of length n which avoid the patterns 4321 and 3142.
 * @author Sean A. Irvine
 */
public class A165530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165530() {
    super(new long[] {-4, 20, -21, 8}, new long[] {1, 1, 2, 6});
  }
}
