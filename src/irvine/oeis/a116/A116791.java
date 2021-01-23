package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116791 Number of permutations of length n which avoid the patterns 1234, 1342, 4312.
 * @author Sean A. Irvine
 */
public class A116791 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116791() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 2, 6, 21, 72, 220, 590, 1409});
  }
}
