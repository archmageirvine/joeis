package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116752 Number of permutations of length n which avoid the patterns <code>1234, 1342, 2431</code>.
 * @author Sean A. Irvine
 */
public class A116752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116752() {
    super(new long[] {-4, 32, -105, 187, -199, 130, -51, 11}, new long[] {1, 2, 6, 21, 74, 248, 787, 2389});
  }
}
